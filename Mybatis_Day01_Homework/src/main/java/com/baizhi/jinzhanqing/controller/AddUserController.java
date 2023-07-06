package com.baizhi.jinzhanqing.controller;

import com.baizhi.jinzhanqing.entity.User;
import com.baizhi.jinzhanqing.service.UserService;
import com.baizhi.jinzhanqing.service.impl.UserServiceImpl;
import com.fasterxml.jackson.databind.ObjectMapper;

import javax.servlet.ServletException;
import javax.servlet.ServletInputStream;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/addUser")
public class AddUserController extends HttpServlet {
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        ObjectMapper objectMapper = new ObjectMapper();
        resp.setContentType("application/json;charset=utf-8");
        PrintWriter writer = resp.getWriter();
        try{
            ServletInputStream inputStream = req.getInputStream();
            User user = objectMapper.readValue(inputStream, User.class);
            UserService userService = new UserServiceImpl();
            userService.register(user);
            writer.write("添加成功");
        }catch (Exception e){
            e.printStackTrace();
            writer.write("添加失败");
        }
    }
}
