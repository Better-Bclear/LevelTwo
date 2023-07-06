package com.baizhi.jinzhanqing.controller;

import com.baizhi.jinzhanqing.service.UserService;
import com.baizhi.jinzhanqing.service.impl.UserServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/removeById")
public class RemoveByIdController extends HttpServlet {
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("application/json;charset=utf-8");
        PrintWriter writer = resp.getWriter();
        try {
            String id = req.getParameter("id");
            UserService userService = new UserServiceImpl();
            userService.removeById(Integer.parseInt(id));
            writer.write("删除成功");
        }catch (Exception e){
            e.printStackTrace();
            writer.write("删除失败");
        }
    }
}
