package com.zdb.controller.superadmin;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.zdb.entity.bo.HeadLine;
import com.zdb.entity.bo.ShopCategory;
import com.zdb.entity.dto.Result;
import com.zdb.service.solo.ShopCategoryService;

/**
 * <p>
 *
 * </p>
 *
 * @author zhaodb 2022/12/30
 * @since 3.0.1
 */
public class ShopCategoryOperationController {

    private ShopCategoryService shopCategoryService;

    public Result<Boolean> addShopCategory(HttpServletRequest req, HttpServletResponse res) {
        return shopCategoryService.addShopCategory(new ShopCategory());
    }

    public Result<Boolean> removeShopCategory(HttpServletRequest req, HttpServletResponse res) {
        return shopCategoryService.removeShopCategory(1L);
    }

    public Result<Boolean> modifyShopCategory(HttpServletRequest req, HttpServletResponse res) {
        return shopCategoryService.modifyShopCategory(new ShopCategory());
    }

    public Result<HeadLine> queryShopCategoryById(HttpServletRequest req, HttpServletResponse res) {
        return shopCategoryService.queryShopCategoryById(1L);
    }

    public Result<List<HeadLine>> queryShopCategory(HttpServletRequest req, HttpServletResponse res) {
        return shopCategoryService.queryShopCategory(new ShopCategory(), 1, 100);
    }
}
