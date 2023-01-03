package com.zdb.service.solo.impl;

import java.util.List;

import org.simpleframework.core.annotation.Service;

import com.zdb.entity.bo.HeadLine;
import com.zdb.entity.bo.ShopCategory;
import com.zdb.entity.dto.Result;
import com.zdb.service.solo.ShopCategoryService;

/**
 * <p>
 *
 * </p>
 *
 * @author zhaodb 2022/12/28
 * @since 3.0.1
 */
@Service
public class ShopCategoryServiceImpl implements ShopCategoryService {
    @Override
    public Result<Boolean> addShopCategory(ShopCategory shopCategory) {
        return null;
    }

    @Override
    public Result<Boolean> removeShopCategory(Long shopCategoryId) {
        return null;
    }

    @Override
    public Result<Boolean> modifyShopCategory(ShopCategory shopCategory) {
        return null;
    }

    @Override
    public Result<HeadLine> queryShopCategoryById(Long shopCategoryId) {
        return null;
    }

    @Override
    public Result<List<HeadLine>> queryShopCategory(ShopCategory shopCategoryCondition, int pageIndex, int pageSize) {
        return null;
    }
}
