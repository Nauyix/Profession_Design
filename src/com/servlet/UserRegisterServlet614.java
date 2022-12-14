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

@WebServlet("/register614")
public class UserRegisterServlet614 {
    public class UserRegisterServlet extends HttpServlet {

        @Override
        protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
            User510 user = new User510();
            request.getParameterMap();
            UserService614 userService = new UserService614();
            try {
                if(userService.register(user)){
                    request.setAttribute("msg","注册成功，请登录！");
                    request.getRequestDispatcher("/login614.jsp").forward(request,response);
                }else{
                    request.setAttribute("msg","用户名存在，请重新注册");
                    request.getRequestDispatcher("/register614.jsp").forward(request,response);
                }
            } catch (SQLException e) {
                throw new RuntimeException(e);
            }

        }

        @Override
        protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
            this.doPost(req,resp);
        }
    }

}
