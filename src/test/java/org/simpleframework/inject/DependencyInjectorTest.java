package org.simpleframework.inject;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.simpleframework.core.BeanContainer;

import com.zdb.controller.frontend.MainPageController;
import com.zdb.service.combine.HeadLineShopCategoryCombineService;
import com.zdb.service.combine.impl.HeadLineShopCategoryCombineServiceImpl;
import com.zdb.service.combine.impl.HeadLineShopCategoryCombineServiceImpl2;

/**
 * <p>
 *
 * </p>
 *
 * @author zhaodb 2023/1/3
 * @since 3.0.1
 */
class DependencyInjectorTest {

    @Test
    @DisplayName("依赖注入doIoc")
    void doIoc() {
        BeanContainer beanContainer = BeanContainer.getInstance();
        beanContainer.loadBeans("com.zdb");
        Assertions.assertEquals(true, beanContainer.isLoaded());
        MainPageController mainPageController = (MainPageController) beanContainer.getBean(MainPageController.class);
        Assertions.assertEquals(true, mainPageController instanceof MainPageController);
        HeadLineShopCategoryCombineService headLineShopCategoryCombineService = mainPageController.getHeadLineShopCategoryCombineService();
        Assertions.assertEquals(null, headLineShopCategoryCombineService);
        new DependencyInjector().doIoc();
        headLineShopCategoryCombineService = mainPageController.getHeadLineShopCategoryCombineService();
        Assertions.assertEquals(true, headLineShopCategoryCombineService instanceof HeadLineShopCategoryCombineServiceImpl);
        Assertions.assertNotEquals(true, headLineShopCategoryCombineService instanceof HeadLineShopCategoryCombineServiceImpl2);

    }
}