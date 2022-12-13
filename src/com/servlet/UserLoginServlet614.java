package com.servlet;

import com.bean.User510;
import com.service.UserService614;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.SQLException;

@WebServlet("/login614")
public class UserLoginServlet614 extends HttpServlet {
    private UserService614 userService614 = new UserService614();
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //接受请求
        String userName = request.getParameter("user_name");
        String userPwd = request.getParameter("user_pwd");

        //调用业务层
        User510 user = null;
        try {
            user = userService614.login(userName,userPwd);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        if(user  == null){
            request.setAttribute("**","用户名或密码错误，请重新登录！");
            request.getRequestDispatcher("/login614.jsp").forward(request,response);
        }else{
            request.getSession().setAttribute("user",user);
            request.getRequestDispatcher("/index.do").forward(request,response);
        }


        //给出响应
    }
}
