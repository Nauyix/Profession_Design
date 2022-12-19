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
      String sender_id=req.getParameter("sender_id");
      String receiver_id=req.getParameter("receiver_id");
      String inform_text=req.getParameter("inform_text");
      String inform_time=req.getParameter("inform_time");
      StringBuilder sb = new StringBuilder();

      sb.append(inform_time.substring(14,16));
      sb.append(inform_time.substring(17,19));
      sb.append(subStringID(sender_id));
      sb.append(subStringID(receiver_id));
      String inform_id = sb.toString();

      try {
         InformDao510 dao505 = new InformDao510();
         Inform510 inform505 = new Inform510(inform_id,sender_id,receiver_id,inform_text,inform_time);
         dao505.insert(inform505);
      } catch (SQLException e) {
         throw new RuntimeException(e);
      }

      resp.sendRedirect("/Profession_Design_war_exploded/acceptNotice505");
   }

   private String subStringID(String stringID){
      while (stringID.length()<=3){
         if(stringID.length()==3) return stringID;
         stringID = "0"+stringID;
      }
      return stringID.substring(stringID.length()-3,stringID.length());
   }
}
