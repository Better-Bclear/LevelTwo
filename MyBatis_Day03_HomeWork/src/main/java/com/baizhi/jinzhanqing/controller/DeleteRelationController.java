package com.baizhi.jinzhanqing.controller;

import com.baizhi.jinzhanqing.service.StudentService;
import com.baizhi.jinzhanqing.service.impl.StudentServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/deleteRelation")
public class DeleteRelationController extends HttpServlet {
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("application/json;charset=utf-8");
        PrintWriter writer = resp.getWriter();
        try {
            String idString = req.getParameter("id");
            Integer id = Integer.parseInt(idString);
            StudentService studentService = new StudentServiceImpl();
            studentService.deleteRelation(id);
            writer.write("删除成功");
        }catch (Exception e){
            e.printStackTrace();
            writer.write("删除出错");
        }
    }
}
