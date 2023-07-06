package com.baizhi.jinzhanqing.controller;

import com.baizhi.jinzhanqing.entity.vo.Pagination;
import com.baizhi.jinzhanqing.service.UserService;
import com.baizhi.jinzhanqing.service.impl.UserServiceImpl;
import com.fasterxml.jackson.databind.ObjectMapper;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/queryByPage")
public class QueryByPageController extends HttpServlet {
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("application/json;charset=utf-8");
        PrintWriter writer = resp.getWriter();
        try {
            ObjectMapper objectMapper = new ObjectMapper();
            String page = req.getParameter("page");
            String size = req.getParameter("size");
            UserService userService = new UserServiceImpl();
            Pagination pagination = userService.queryByPage(Integer.parseInt(size), Integer.parseInt(page));
            String paginationString = objectMapper.writeValueAsString(pagination);
            writer.write(paginationString);
        }catch (Exception e){
            e.printStackTrace();
            writer.write("查询出错");
        }
    }
}
