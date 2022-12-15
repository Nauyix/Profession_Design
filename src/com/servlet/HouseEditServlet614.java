package com.servlet;

import com.bean.House510;
import com.dao.HouseDao510;
import com.utils.StringUtil614;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.SQLException;

@WebServlet("/houseedit")
public class HouseEditServlet614 extends HttpServlet {

    private HouseDao510 houseDao = new HouseDao510();
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String houseId = request.getParameter("house_id");
        if(StringUtil614.isNotEmpty(houseId)) {
            int houseid = Integer.parseInt(houseId);
            House510 house;
            try {
                house = houseDao.find(houseid);
            } catch (SQLException e) {
                throw new RuntimeException(e);
            }
            request.getSession().setAttribute("house", house);
            response.sendRedirect("houseedit.jsp");

        }
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        super.doGet(req, resp);
    }
}
