package com.zdb;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import lombok.extern.slf4j.Slf4j;

/**
 * <p>
 *
 * </p>
 *
 * @author zhaodb 2022/12/27
 * @since 3.0.1
 */
@WebServlet("/hello")
@Slf4j
public class HelloServlet extends HttpServlet {
    @Override
    public void destroy() {
        System.out.println(" 初始化 。。。。");
    }

    @Override
    public void service(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
        System.out.println(" service.. execute doGet ");
        doGet(req, res);
    }

    @Override
    public void init() throws ServletException {
        System.out.println(" 初始化 。。。。");
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String name = "my simple framework";
        log.debug("name is :{}", name);
        req.setAttribute("name", name);
        req.getRequestDispatcher("/WEB-INF/jsp/hello.jsp").forward(req, resp);
    }
}
