package com.servlet;

import com.bean.House510;
import com.dao.HouseDao510;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.SQLException;

public class UpdateServlet614 extends HttpServlet {
    private HouseDao510 houseDao = new HouseDao510();

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("UTF-8");

        String house_prov = request.getParameter("house_prov");
        String house_city = request.getParameter("house_city");
        String house_dist = request.getParameter("house_dist");
        String house_adds = request.getParameter("house_adds");
        double house_area = Double.parseDouble(request.getParameter("house_area"));
        double house_price = Double.parseDouble(request.getParameter("housej_price"));
        int house_age = Integer.parseInt(request.getParameter("house_age"));

        try {
            houseDao.update(new House510("1", "house_prov", "house_city", "house_dist", "house_adds", house_area, house_price, "house_type",house_age,"sell_type","house_status"));
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

        response.sendRedirect("/index");
    }
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doPost(req, resp);
    }
}
