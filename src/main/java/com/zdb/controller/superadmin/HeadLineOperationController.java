package com.zdb.controller.superadmin;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.simpleframework.core.annotation.Controller;

import com.zdb.entity.bo.HeadLine;
import com.zdb.entity.dto.Result;
import com.zdb.service.solo.HeadLineService;

/**
 * <p>
 *
 * </p>
 *
 * @author zhaodb 2022/12/29
 * @since 3.0.1
 */
@Controller
public class HeadLineOperationController {

    private HeadLineService headLineService;

    Result<Boolean> addHeadLine(HttpServletRequest req, HttpServletResponse res) {
        return headLineService.addHeadLine(new HeadLine());
    }

    Result<Boolean> removeHeadLine(HttpServletRequest req, HttpServletResponse res) {
        return headLineService.removeHeadLine(1L);
    }

    Result<Boolean> modifyHeadLine(HttpServletRequest req, HttpServletResponse res) {
        return headLineService.modifyHeadLine(new HeadLine());
    }

    Result<HeadLine> queryHeadLineById(HttpServletRequest req, HttpServletResponse res) {
        return headLineService.queryHeadLineById(1L);
    }

    Result<List<HeadLine>> queryHeadLine(HttpServletRequest req, HttpServletResponse res) {
        return headLineService.queryHeadLine(new HeadLine(), 1, 10);
    }

}
