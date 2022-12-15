package com.servlet;

import com.bean.House510;
import com.bean.User510;
import com.dao.HouseDao510;
import com.utils.StringUtil614;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

@WebServlet("/HouseDelServlet614")
public class HouseDelServlet614 extends HttpServlet {
    private HouseDao510 houseDao = new HouseDao510();
    List<House510> houselist;
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
    }
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doPost(req, resp);
    }
}
