package org.simpleframework.core;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import org.simpleframework.core.annotation.Component;
import org.simpleframework.core.annotation.Controller;
import org.simpleframework.core.annotation.Service;

import com.zdb.controller.DispatcherServlet;
import com.zdb.controller.frontend.MainPageController;
import com.zdb.service.solo.HeadLineService;
import com.zdb.service.solo.impl.HeadLineServiceImpl;

/**
 * <p>
 *
 * </p>
 *
 * @author zhaodb 2023/1/3
 * @since 3.0.1
 */
@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
class BeanContainerTest {

    private static BeanContainer beanContainer;

    @BeforeAll
    static void init() {
        beanContainer = BeanContainer.getInstance();
    }

    @Test
    @DisplayName("bean加载")
    @Order(1)
    void loadBeans() {
        Assertions.assertEquals(false, beanContainer.isLoaded());
        beanContainer.loadBeans("com.zdb");
        Assertions.assertEquals(6, beanContainer.size());
        Assertions.assertEquals(true, beanContainer.isLoaded());
    }

    @Test
    @DisplayName("根据类获取bean实例")
    void getBean() {
        MainPageController controller = (MainPageController) beanContainer.getBean(MainPageController.class);
        Assertions.assertEquals(true, controller instanceof MainPageController);
        DispatcherServlet servlet = (DispatcherServlet) beanContainer.getBean(DispatcherServlet.class);
        Assertions.assertEquals(null, servlet);
    }

    @Test
    void getClasses() {
    }

    @Test
    @DisplayName("根据注解获取对应实例")
    void getClassByAnnotation() {
        Assertions.assertEquals(true, beanContainer.isLoaded());
        Assertions.assertEquals(3, beanContainer.getClassByAnnotation(Controller.class).size());
        Assertions.assertEquals(3, beanContainer.getClassByAnnotation(Service.class).size());
        Assertions.assertEquals(null, beanContainer.getClassByAnnotation(Component.class));
    }

    @Test
    void getClassBySuper() {
        Assertions.assertEquals(true, beanContainer.isLoaded());
        Assertions.assertEquals(true, beanContainer.getClassBySuper(HeadLineService.class).contains(HeadLineServiceImpl.class));
    }

}