package com.servlet;

import com.dao.HouseDao510;
import com.utils.StringUtil614;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.SQLException;

public class DelServlet614 extends HttpServlet {
    private HouseDao510 houseDao = new HouseDao510();

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String idStr = request.getParameter("id");
        if(StringUtil614.isNotEmpty(idStr)){
            int id = Integer.parseInt(idStr);
            try {
                houseDao.delete(id);
            } catch (SQLException e) {
                throw new RuntimeException(e);
            }
            response.sendRedirect("/index");

        }
    }
}
