package com.zdb.service.solo;

import java.util.List;

import com.zdb.entity.bo.HeadLine;
import com.zdb.entity.bo.ShopCategory;
import com.zdb.entity.dto.Result;

/**
 * <p>
 *
 * </p>
 *
 * @author zhaodb 2022/12/28
 * @since 3.0.1
 */
public interface ShopCategoryService {

    Result<Boolean> addShopCategory(ShopCategory shopCategory);

    Result<Boolean> removeShopCategory(Long shopCategoryId);

    Result<Boolean> modifyShopCategory(ShopCategory shopCategory);

    Result<HeadLine> queryShopCategoryById(Long shopCategoryId);

    Result<List<HeadLine>> queryShopCategory(ShopCategory shopCategoryCondition, int pageIndex, int pageSize);

}
