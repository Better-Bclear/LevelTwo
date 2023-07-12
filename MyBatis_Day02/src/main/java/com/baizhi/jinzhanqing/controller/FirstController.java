package com.baizhi.jinzhanqing.controller;

import com.baizhi.jinzhanqing.entity.User;
import com.fasterxml.jackson.databind.ObjectMapper;

import javax.servlet.ServletException;
import javax.servlet.ServletInputStream;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@WebServlet("/test")
public class FirstController extends HttpServlet {
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("application/json;charset=utf-8");
        PrintWriter writer = resp.getWriter();
        ObjectMapper o = new ObjectMapper();
        ServletInputStream inputStream = req.getInputStream();
        Map<String,String> map = o.readValue(inputStream, Map.class);
//        User user = new User();
//        user.setUsername("aaa");
//        user.setPassword("sss");
//        String s1 = o.writeValueAsString(user);
//        System.out.println(s1);
//        //调用service层的方法
        System.out.println(map.get("username"));
        System.out.println(map.get("password"));
        HttpSession session = req.getSession();
        session.setAttribute("username",map.get("username"));


        //删除
        Object username = session.getAttribute("username");
        if (username != null){

        }else{
        }

        System.out.println("这是结果");
//        List<String> list = new ArrayList<>();
//        String s = o.writeValueAsString(map);
//        System.out.println(s);
//        list.add("aaa");
//        list.add("bbb");
        writer.write("接受成功");
//        String username = req.getParameter("username");
//        String password = req.getParameter("password");
//        //执行也无层的方法
//        System.out.println(username);
//        System.out.println(password);
    }
}
