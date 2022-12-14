package com.servlet;

import com.bean.House510;
import com.dao.HouseDao510;
import com.utils.StringUtil614;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

public class IndexServlet614 extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {


        HouseDao510 houseDao = new HouseDao510();
        HttpSession session = request.getSession();

        List<House510> HouseList = null;
        try {
            HouseList = houseDao.findAll();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

        session.setAttribute("HouseList", HouseList);
        response.sendRedirect("index.jsp");

    }
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doGet(req, resp);
    }
}
