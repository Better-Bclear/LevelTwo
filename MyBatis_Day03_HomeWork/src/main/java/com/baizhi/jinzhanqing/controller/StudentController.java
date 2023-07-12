package com.baizhi.jinzhanqing.controller;

import com.baizhi.jinzhanqing.entity.Student;
import com.baizhi.jinzhanqing.service.impl.StudentServiceImpl;
import com.fasterxml.jackson.databind.ObjectMapper;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet("/queryAllStudent")
public class StudentController extends HttpServlet {
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("application/json;charset=UTF-8");
        StudentServiceImpl studentService = new StudentServiceImpl();
        List<Student> list = studentService.queryAll();
        ObjectMapper objectMapper = new ObjectMapper();
        String s = objectMapper.writeValueAsString(list);
        resp.getWriter().write(s);
    }
}
