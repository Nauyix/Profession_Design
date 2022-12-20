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

@WebServlet("/houseedit614")
public class HouseEditServlet614 extends HttpServlet {


    private HouseDao510 houseDao = new HouseDao510();
    House510 house;

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        String houseId = request.getParameter("id");
        System.out.println(houseId);
        if(StringUtil614.isNotEmpty(houseId)) {
            System.out.println(houseId);

            int houseid = Integer.parseInt(houseId);

            try {
                house = houseDao.find(houseid);
            } catch (SQLException e) {
                throw new RuntimeException(e);
            }

            System.out.println(houseId);

            request.getSession().setAttribute("house", house);
            response.sendRedirect("houseedit614.jsp");

        }
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        super.doGet(req, resp);
    }
}
