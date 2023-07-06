package com.baizhi.jinzhanqing.controller;

import com.baizhi.jinzhanqing.entity.User;
import com.baizhi.jinzhanqing.entity.vo.RegisterVO;
import com.baizhi.jinzhanqing.service.UserService;
import com.baizhi.jinzhanqing.service.impl.UserServiceImpl;
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

@WebServlet("/register")
public class RegisterController extends HttpServlet {
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("application/json;charset=utf-8");
        HttpSession session = req.getSession();
        String icaptcha = (String)session.getAttribute("icaptcha");
        PrintWriter writer = resp.getWriter();
        try {
            ObjectMapper objectMapper = new ObjectMapper();
            ServletInputStream inputStream = req.getInputStream();
            RegisterVO registerVO = objectMapper.  readValue(inputStream, RegisterVO.class);
            String iCaptha = registerVO.getIcaptha();
            if(iCaptha.equalsIgnoreCase(icaptcha)){
                User user = new User();
                user.setUserName(registerVO.getUserName());
                user.setUserPwd(registerVO.getUserPwd());
                user.setUserEmail(registerVO.getUserEmail());
                UserService userService = new UserServiceImpl();
                userService.register(user);
                writer.write("注册成功");
            }else{
                writer.write("验证码错误");
            }
        }catch (Exception e){
            e.printStackTrace();
            writer.write("注册出错");
        }
    }
}
