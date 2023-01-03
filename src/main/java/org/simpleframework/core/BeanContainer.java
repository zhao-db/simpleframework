package org.simpleframework.core;

import java.lang.annotation.Annotation;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.extern.slf4j.Slf4j;

import org.simpleframework.core.annotation.Component;
import org.simpleframework.core.annotation.Controller;
import org.simpleframework.core.annotation.Repositiory;
import org.simpleframework.core.annotation.Service;
import org.simpleframework.util.ClassUtil;
import org.simpleframework.util.ValidationUtil;

/**
 * <p>
 * IOC容器
 * </p>
 *
 * @author zhaodb 2023/1/3
 * @since 3.0.1
 */
@NoArgsConstructor(access = AccessLevel.PRIVATE)
@Slf4j
public class BeanContainer {

    public static BeanContainer getInstance() {
        return BeanContainerHolder.HOLDER.instance;
    }

    /**
     * 是否被加载过
     */
    @Getter
    private boolean loaded = false;

    private final Map<Class<?>, Object> beanMap = new ConcurrentHashMap<>();

    /**
     * 获取bean数量
     *
     * @return
     */
    public int size() {
        return beanMap.size();
    }

    private static final List<Class<? extends Annotation>> BEAN_ANNOTATION = Arrays.asList(Controller.class, Service.class, Component.class, Repositiory.class);

    private enum BeanContainerHolder {
        HOLDER;
        private BeanContainer instance;

        BeanContainerHolder() {
            instance = new BeanContainer();
        }

    }

    /**
     * 扫描加载所有bean
     *
     * @param packageName
     */
    public synchronized void loadBeans(String packageName) {
        if (loaded) {
            return;
        }
        Set<Class<?>> classSet = ClassUtil.extractPackageClass(packageName);
        if (ValidationUtil.isEmpty(classSet)) {
            log.warn("extract nothing form packageName:{}", packageName);
            return;
        }
        for (Class<?> clazz : classSet) {
            for (Class<? extends Annotation> annotation : BEAN_ANNOTATION) {
                if (clazz.isAnnotationPresent(annotation)) {
                    beanMap.put(clazz, ClassUtil.newInstance(clazz, true));
                }
            }
        }
        loaded = true;
    }

    /**
     * 获取bean
     *
     * @param clazz
     * @return
     */
    public Object getBean(Class<?> clazz) {
        return beanMap.get(clazz);
    }

    /**
     * 删除bean
     *
     * @param clazz
     * @return
     */
    public Object removeBean(Class<?> clazz) {
        return beanMap.remove(clazz);
    }

    /**
     * 添加bean
     *
     * @param clazz
     * @param bean
     * @return
     */
    public Object addBean(Class<?> clazz, Object bean) {
        return beanMap.put(clazz, bean);
    }

    public Set<Class<?>> getClasses() {
        return beanMap.keySet();
    }

    public Set<Object> getBeans() {
        return new HashSet<>(beanMap.values());
    }

    /**
     * 获取注解
     *
     * @param annotation
     * @return
     */
    public Set<Class<?>> getClassByAnnotation(Class<? extends Annotation> annotation) {
        Set<Class<?>> keySet = getClasses();
        if (ValidationUtil.isEmpty(keySet)) {
            log.warn("nothing in beanMap");
            return null;
        }
        Set<Class<?>> classSet = new HashSet<>();
        for (Class<?> clazz : keySet) {
            if (clazz.isAnnotationPresent(annotation)) {
                classSet.add(clazz);
            }
        }
        return ValidationUtil.isEmpty(classSet) ? null : classSet;
    }

    /**
     * 获取接口实现的class集合
     *
     * @param interfaceOrClass
     * @return
     */
    public Set<Class<?>> getClassBySuper(Class<?> interfaceOrClass) {
        Set<Class<?>> keySet = getClasses();
        if (ValidationUtil.isEmpty(keySet)) {
            log.warn("nothing in beanMap");
            return null;
        }
        Set<Class<?>> classSet = new HashSet<>();
        for (Class<?> clazz : keySet) {
            if (interfaceOrClass.isAssignableFrom(clazz) && !clazz.equals(interfaceOrClass)) {
                classSet.add(clazz);
            }
        }
        return ValidationUtil.isEmpty(classSet) ? null : classSet;
    }
}
