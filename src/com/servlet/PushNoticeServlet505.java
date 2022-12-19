package com.servlet;

import com.bean.Inform510;
import com.dao.ContractDao510;
import com.dao.InformDao510;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.SQLException;
import java.text.SimpleDateFormat;

/**
 * @BelongsProject: Profession_Design
 * @BelongsPackage: com.servlet
 * @Classname: PushNoticeServlet505
 * @Author: Bianca
 * @CreateTime: 2022-12-14  17:55
 * @Description: ·¢ËÍÍ¨Öª
 * @Version: 1.0
 */
@WebServlet(name="PushNoticeServlet505",value="/PushNoticeServlet505")
public class PushNoticeServlet505 extends HttpServlet {
   @Override
   protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
      doPost(req, resp);
   }

   @Override
   protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
      String senderId=req.getParameter("sender_id");
      String receiverId=req.getParameter("receiver_id");
      String informText=req.getParameter("inform_text");
      String informTime=req.getParameter("time");
      StringBuilder sb = new StringBuilder();

      sb.append(subStringID(senderId));
      sb.append(subStringID(receiverId));
      String informId = sb.toString();

      Inform510 inform505 = new Inform510(informId,senderId,receiverId,informText,informTime);
      InformDao510 dao505 = new InformDao510();

      try {
         boolean flag = dao505.insert(inform505);
         if(flag = true) resp.sendRedirect("userindex614.jsp");
         else  resp.sendRedirect("pushNotice505.jsp");//
      } catch (SQLException e) {
         throw new RuntimeException(e);
      }
   }

   private String subStringID(String stringID){
      while (stringID.length()<=3){
         if(stringID.length()==3) return stringID;
         stringID = "0"+stringID;
      }
      return stringID.substring(stringID.length()-3,stringID.length());
   }
}
