package com.zdb.controller.frontend;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import lombok.Getter;

import org.simpleframework.inject.annotation.Autowired;
import org.simpleframework.core.annotation.Controller;

import com.zdb.entity.dto.MainPageInfoDTO;
import com.zdb.entity.dto.Result;
import com.zdb.service.combine.HeadLineShopCategoryCombineService;

/**
 * <p>
 *
 * </p>
 *
 * @author zhaodb 2022/12/29
 * @since 3.0.1
 */
@Controller
public class MainPageController {

    @Autowired("HeadLineShopCategoryCombineServiceImpl")
    @Getter
    private HeadLineShopCategoryCombineService headLineShopCategoryCombineService;

    public Result<MainPageInfoDTO> getMainPageInfo(HttpServletRequest req, HttpServletResponse res) {
        return headLineShopCategoryCombineService.getMainPageInfo();
    }
}
