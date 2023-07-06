package com.baizhi.jinzhanqing.controller;

import com.baizhi.jinzhanqing.entity.User;
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

@WebServlet("/queryById")
public class QueryByIdController extends HttpServlet {
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("application/json");
        PrintWriter writer = resp.getWriter();
        String id = req.getParameter("id");
        System.out.println(id);
        ObjectMapper objectMapper = new ObjectMapper();
        try {
            UserService userService = new UserServiceImpl();
            User user = userService.queryById(Integer.parseInt(id));
            String s = objectMapper.writeValueAsString(user);
            writer.write(s);
        }catch (Exception e){
            e.printStackTrace();
            writer.write("查询失败");
        }
    }
}
