package org.simpleframework.util;

import java.util.Set;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

/**
 * <p>
 *
 * </p>
 *
 * @author zhaodb 2023/1/3
 * @since 3.0.1
 */
public class ClassUtilTest {

    @Test
    @DisplayName("提取目标类方法")
    public void extractPackageClass() {
        Set<Class<?>> classSet = ClassUtil.extractPackageClass("com.zdb.entity");
        System.out.println("classSet = " + classSet);
        Assertions.assertEquals(4, classSet.size());
    }

}