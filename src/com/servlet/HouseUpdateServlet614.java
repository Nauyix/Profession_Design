package com.servlet;

import com.bean.House510;
import com.dao.HouseDao510;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.SQLException;


@WebServlet("/HouseUpdateServlet614")
public class HouseUpdateServlet614 extends HttpServlet {
    private HouseDao510 houseDao = new HouseDao510();

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("UTF-8");

        System.out.println("123");
        System.out.println("qwq"+request.getParameter("house_prov")+"qwq");
        int id = Integer.parseInt(request.getParameter("house_id"));
        String house_prov = request.getParameter("house_prov");
        String house_city = request.getParameter("house_city");
        String house_dist = request.getParameter("house_dist");
        String house_adds = request.getParameter("house_adds");

        double house_area = Double.parseDouble(request.getParameter("house_area"));
        double house_price = Double.parseDouble(request.getParameter("house_price"));
        int house_age = Integer.parseInt(request.getParameter("house_age"));
        String house_type = request.getParameter("house_type");
        String sell_type = request.getParameter("sell_type");
        String fitement = request.getParameter("fitement");

        try {
            houseDao.update(new House510(id, house_prov, house_city, house_dist, house_adds, house_area, house_price, house_type,house_age,sell_type,fitement));
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }


        response.sendRedirect("/Profession_Design_war_exploded/houseindex614");
    }
    protected void doGet(HttpServletRequest req,HttpServletResponse resp) throws ServletException, IOException {
        doPost(req, resp);
    }
}
