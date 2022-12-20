package com.servlet;

import com.dao.HouseDao510;
import com.utils.StringUtil614;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.SQLException;

@WebServlet("/HouseDelServlet614")
public class HouseDelServlet614 extends HttpServlet {
    private HouseDao510 houseDao = new HouseDao510();

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String idStr = null;
        idStr = request.getParameter("id");
        if(StringUtil614.isNotEmpty(idStr)){
            int id = Integer.parseInt(idStr);
            try {
                houseDao.delete(id);
            } catch (SQLException e) {
                throw new RuntimeException(e);
            }
            response.sendRedirect("/Profession_Design_war_exploded/houseindex614_");

        }
    }
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doPost(req, resp);
    }
}
