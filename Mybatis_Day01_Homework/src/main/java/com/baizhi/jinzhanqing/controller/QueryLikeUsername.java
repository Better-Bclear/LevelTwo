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
import java.util.List;

@WebServlet("/queryByLikeUsername")
public class QueryLikeUsername extends HttpServlet {
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String username = req.getParameter("userName");
        resp.setContentType("application/json;charset=utf-8");
        PrintWriter writer = resp.getWriter();
        ObjectMapper objectMapper = new ObjectMapper();
        try{
            UserService userService = new UserServiceImpl();
            List<User> users = userService.queryLikeUsername(username);
            String s = objectMapper.writeValueAsString(users);
            writer.write(s);
        }catch (Exception e){
            e.printStackTrace();
            writer.write("查询出错");
        }
    }
}
