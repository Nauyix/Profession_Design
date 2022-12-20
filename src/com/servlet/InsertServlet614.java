package com.servlet;

import com.bean.House510;
import com.bean.User510;
import com.dao.HouseDao510;


import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.SQLException;

@WebServlet("/InsertServlet614")
public class InsertServlet614 extends HttpServlet {
    private HouseDao510 houseDao = new HouseDao510();
    House510 house ;
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("UTF-8");
        HouseDao510 hd=new HouseDao510();
        String house_prov = request.getParameter("house_prov");
        String house_city = request.getParameter("house_city");
        String house_dist = request.getParameter("house_dist");
        String house_adds = request.getParameter("house_adds");
        String house_type = request.getParameter("house_type");
        String sell_type = request.getParameter("sell_type");
        String house_status = request.getParameter("fitement");
        Double house_area = Double.parseDouble(request.getParameter("house_area"));
        Double house_price = Double.parseDouble(request.getParameter("house_price"));
        Integer house_age = Integer.parseInt(request.getParameter("age"));
        User510 us510 =(User510) this.getServletContext().getAttribute("user");
        String sellerid=String.valueOf(us510.getUser_id());
        try {
            house = new House510(hd.getsize()+1, house_prov, house_city, house_dist, house_adds, house_area, house_price, house_type,house_age,sell_type,house_status,sellerid);
            houseDao.insert(house);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

        response.sendRedirect("/Profession_Design_war_exploded/houseindex614");

    }
}
