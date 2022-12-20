package com.servlet;

import com.bean.House510;
import com.bean.User510;
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

@WebServlet("/HouseIndexServlet614_")
public class HouseIndexServlet614_ extends HttpServlet {
    List<House510> houselist;


    public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        User510 us510 =(User510) request.getServletContext().getAttribute("user");
        String seller_id=String.valueOf(us510.getUser_id());

        HouseDao510 houseDao = new HouseDao510();
        HttpSession session = request.getSession();

        try {
            houselist = houseDao.findAll(seller_id);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

        session.setAttribute("HouseList1", houselist);
        response.sendRedirect("houseindex614_.jsp");

    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        super.doPost(req, resp);
    }




}
