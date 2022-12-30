package com.zdb.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import lombok.extern.slf4j.Slf4j;

import com.zdb.controller.frontend.MainPageController;
import com.zdb.controller.superadmin.ShopCategoryOperationController;

/**
 * <p>
 *
 * </p>
 *
 * @author zhaodb 2022/12/29
 * @since 3.0.1
 */
@WebServlet("/")
@Slf4j
public class DispatcherServlet extends HttpServlet {


    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String servletPath = req.getServletPath();
        String reqMethod = req.getMethod();
        System.out.println("req.getServletPath() = " + servletPath);
        System.out.println("req.getMethod() = " + reqMethod);
        if (reqMethod.equals("GET") && servletPath.equals("/mainPageInfo")) {
            new MainPageController().getMainPageInfo(req, resp);
        } else if (reqMethod.equals("POST") && servletPath.equals("/superadmin/addShopCategory")) {
            new ShopCategoryOperationController().addShopCategory(req, resp);
        }

    }
}
