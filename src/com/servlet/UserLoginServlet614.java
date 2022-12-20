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

@WebServlet("/UserLoginServlet614")
public class UserLoginServlet614 extends HttpServlet {
    private final UserService614 userService614 = new UserService614();
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //接受请求
        request.setCharacterEncoding("UTF-8");
        response.setContentType("text/html;charset=utf-8");

        String userName = request.getParameter("user_name");
        String userPwd = request.getParameter("user_pwd");
        System.out.println("Using LoginServlet");
        //调用业务层
        User510 user;
        try {

            user = userService614.login(userName,userPwd);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        if(user  == null){
            request.setAttribute("msg","用户名或密码错误，请重新登录！");
            request.getRequestDispatcher("login614.jsp").forward(request,response);
        }else{
            request.getServletContext().setAttribute("user",user);
            this.getServletContext().setAttribute("userlogin",1);
            this.getServletContext().setAttribute("username",user.getUser_name());
            request.getSession().setAttribute("user",user);
            request.getRequestDispatcher("userindex614.jsp").forward(request,response);
        }
        //给出响应
    }
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doPost(req, resp);
    }
}
