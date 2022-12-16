package com.servlet;

import com.bean.House510;
import com.dao.HouseDao510;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

@WebServlet("/houseindex614")
public class HouseIndexServlet614 extends HttpServlet {
    List<House510> HouseList;

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {


        HouseDao510 houseDao = new HouseDao510();
        HttpSession session = request.getSession();


        try {
            HouseList = houseDao.findAll();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

        session.setAttribute("HouseList", HouseList);
        response.sendRedirect("houseindex614.jsp");

    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        super.doPost(req, resp);
    }
}

