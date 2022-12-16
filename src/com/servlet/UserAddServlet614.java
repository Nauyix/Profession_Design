package com.servlet;

import com.bean.User510;
import com.dao.UserDao510;
import com.service.UserService614;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.SQLException;


@WebServlet(value="/UserAddServlet614",name="UserAddServlet614")
public class UserAddServlet614 extends HttpServlet {
    private UserDao510 userDao = new UserDao510();

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("UTF-8");

        String nickname = request.getParameter("nickname");
        String password = request.getParameter("password");
        String email = request.getParameter("email");
        String phonenumber = request.getParameter("phonenumber");
        int usertype = Integer.parseInt(request.getParameter("usertype")) ;
        User510 user = null;
        try {
            user = new User510((userDao.getSize()+1),nickname, password, phonenumber, email, usertype);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        try {
            userDao.insert(user);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        UserService614 userService = new UserService614();
        try {
            if(userService.register(user)){
                request.getSession().setAttribute("user",userDao.findAll());
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
}
