package com.servlet;

import com.bean.Inform510;
import com.bean.User510;
import com.dao.InformDao510;

import java.io.IOException;
import java.sql.*;
import java.util.*;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


/**
 * @BelongsProject: Profession_Design
 * @BelongsPackage: com.servlet
 * @Classname: AcceptNoticeServlet
 * @Author: Bianca
 * @CreateTime: 2022-12-14  21:08
 * @Description: 接受通知
 * @Version: 1.0
 */
@WebServlet("/acceptNotice505")
public class AcceptNoticeServlet505 extends HttpServlet {
   List<Inform510> informList;
   @Override
   protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
      doPost(req, resp);
   }

   @Override
   protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
      InformDao510 informDao505 = new InformDao510();
      HttpSession session = req.getSession();


//      try {
//         informList = informDao505.findAll(receiverId);
//      } catch (SQLException e) {
//         throw new RuntimeException(e);
//      }

      try {
         informList = informDao505.findAll();
      } catch (SQLException e) {
         throw new RuntimeException(e);
      }
      session.setAttribute("informList", informList);
      resp.sendRedirect("acceptNotice505.jsp");
   }
}