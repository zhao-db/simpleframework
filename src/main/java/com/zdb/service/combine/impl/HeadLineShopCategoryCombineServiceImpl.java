package com.zdb.service.combine.impl;

import java.util.List;

import org.simpleframework.core.annotation.Service;

import com.zdb.entity.bo.HeadLine;
import com.zdb.entity.bo.ShopCategory;
import com.zdb.entity.dto.MainPageInfoDTO;
import com.zdb.entity.dto.Result;
import com.zdb.service.combine.HeadLineShopCategoryCombineService;
import com.zdb.service.solo.HeadLineService;
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
public class HeadLineShopCategoryCombineServiceImpl implements HeadLineShopCategoryCombineService {

    private HeadLineService headLineService;
    private ShopCategoryService shopCategoryService;

    @Override
    public Result<MainPageInfoDTO> getMainPageInfo() {
        HeadLine headLineCondition = new HeadLine();
        headLineCondition.setEnableStatus(1);
        Result<List<HeadLine>> headLineResult = headLineService.queryHeadLine(headLineCondition, 1, 4);
        ShopCategory shopCategoryCondition = new ShopCategory();
        Result<List<HeadLine>> shopCategoryResult = shopCategoryService.queryShopCategory(shopCategoryCondition, 1, 100);
        Result<MainPageInfoDTO> result = mergeMainPageInfoResult(headLineResult, shopCategoryResult);
        return result;
    }

    private Result<MainPageInfoDTO> mergeMainPageInfoResult(Result<List<HeadLine>> headLineResult, Result<List<HeadLine>> shopCategoryResult) {
        return null;
    }
}
