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

@WebServlet("/houseadd614")//设置name和value，不要留空！不然会成为缺省servlet
//没关系，只要你留空了，整个项目就会出现很迷的错误
//然后，每个servlet一定要写doget和do地打个包动懂post   这个就没写C:才懂-(


public class HouseInsertServlet614 extends HttpServlet {
    private HouseDao510 houseDao = new HouseDao510();
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("UTF-8");

        String house_prov = request.getParameter("prov");
        String house_city = request.getParameter("city");
        String house_dist = request.getParameter("dist");
        String house_adds = request.getParameter("adds");
        Double house_area = Double.parseDouble(request.getParameter("house_area"));
        Double house_price = Double.parseDouble(request.getParameter("housej_price"));
        String type = request.getParameter("type");
        Integer house_age = Integer.parseInt(request.getParameter("age"));
        String housedtype = request.getParameter("housedtype");
        String fitement = request.getParameter("fitement");
        House510 house = new House510(1, "prov", "city", "dist", "adds", house_area, house_price, "type",house_age,"housetype","house_status");
        try {
            houseDao.insert(house);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        try {
           request.getSession().setAttribute("house",houseDao.findAll());
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

        response.sendRedirect("houseindex.jsp");

    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        super.doGet(req, resp);
    }
}
