package com.servlet;

import com.bean.House510;
import com.dao.HouseDao510;
import com.utils.StringUtil614;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

public class IndexServlet614 extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        Integer pageNo = 1;
        String pageNoStr = request.getParameter("pageNo");
        if (StringUtil614.isNotEmpty(pageNoStr)) {
            pageNo = Integer.parseInt(pageNoStr);
        }
        HttpSession session = request.getSession();
        session.setAttribute("pageNo", pageNo);
        HouseDao510 houseDao = new HouseDao510();
        List<House510> HouseList = null;
        try {
            HouseList = houseDao.findAll();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

        session.setAttribute("HouseList", HouseList);


    }
}
