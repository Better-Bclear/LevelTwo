package com.baizhi.jinzhanqing.controller;

import com.baizhi.jinzhanqing.entity.vo.PaginationVO;
import com.baizhi.jinzhanqing.service.UserService;
import com.baizhi.jinzhanqing.service.UserServiceImpl;
import com.fasterxml.jackson.databind.ObjectMapper;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/queryUserByPage")
public class QueryUserByPageController extends HttpServlet {
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String page = req.getParameter("page");
        String size = req.getParameter("size");
        UserService userService = new UserServiceImpl();
        PaginationVO paginationVO = userService.queryByPage(Integer.parseInt(size),Integer.parseInt(page));
        resp.setContentType("application/json;charset=utf-8");
        ObjectMapper mapper = new ObjectMapper();
        String s = mapper.writeValueAsString(paginationVO);
        PrintWriter writer = resp.getWriter();
        writer.write(s);

    }
}
