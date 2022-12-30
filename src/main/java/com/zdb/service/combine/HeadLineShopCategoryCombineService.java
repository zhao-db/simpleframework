package com.zdb.service.combine;

import com.zdb.entity.dto.MainPageInfoDTO;
import com.zdb.entity.dto.Result;

/**
 * <p>
 *
 * </p>
 *
 * @author zhaodb 2022/12/28
 * @since 3.0.1
 */
public interface HeadLineShopCategoryCombineService {

    Result<MainPageInfoDTO> getMainPageInfo();

}
