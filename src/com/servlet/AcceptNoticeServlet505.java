package com.servlet;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.*;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


/**
 * @BelongsProject: Profession_Design
 * @BelongsPackage: com.servlet
 * @Classname: AcceptNoticeServlet
 * @Author: Bianca
 * @CreateTime: 2022-12-14  21:08
 * @Description: 接受通知
 * @Version: 1.0
 */
@WebServlet(name="AcceptNoticeServlet505",value="/AcceptNoticeServlet505")
public class AcceptNoticeServlet505 extends HttpServlet {
   private static String jdbcDriver = "com.mysql.jdbc.Driver";// mysql连接驱动,无需改

   public static String jdbcUrl = "jdbc:mysql://localhost:3306/?serverTimezone=GMT";
   public static String jdbcUser = "root";//数据库用户名
   public static String jdbcPwd = "root";//数据库密码
   private static Connection conn;
   public static Statement st;

   static {
      try {
         Class.forName(jdbcDriver);// 加载mysql驱动类
         conn = DriverManager.getConnection(jdbcUrl, jdbcUser, jdbcPwd);
         // 驱动利用驱动地址，数据库用户名，密码创建连接
         st = conn.createStatement();
      } catch (Exception e) {
         e.printStackTrace();
      }
   }

   @Override
   protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
      doPost(req, resp);
   }

   @Override
   protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
      super.doPost(req, resp);
   }

   @Override
   protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
      List<Map> list =new ArrayList<Map>();//创建list集合用于存入map的键值对集合

      String receiverId = req.getParameter("receiver_id");//接收jsp传来的数据
      System.out.println(receiverId);

      try {
         String sql ="SELECT pd_inform.`sender_id`,pd_inform.`inform_text`,pd_inform.`inform_time`\r\n"+
                 "FROM pd_inform\r\n"+
                 "WHERE pd_inform.receiver_id="+receiverId;

         ResultSet rs = st.executeQuery(sql);
         //从数据库读取的内容，返回一个结果集。
         System.out.println("接受通知");
         while (rs.next()) {
            String senderId = rs.getString("sender_id");
            String informText = rs.getString("inform_text");
            String informTime = rs.getString("inform_time");
            //获取用循环接收数据库的表格信息

            Map map = new HashMap();
            map.put("senderId", senderId);
            map.put("informText", informText);
            map.put("informTime", informTime);
            //存入map集合中

            list.add(map);//将map集合对象存入list集合

            for (Map map_1 :list) {
               System.out.println(map_1);
            }//在打印台遍历出数据查看是否有错误

         }
      } catch (Exception e) {
         e.printStackTrace();
      }

      req.setAttribute("informList",list);//将list集合数据放入到request中共享
      req.getRequestDispatcher("/acceptNotice505.jsp").forward(req, resp);
      //跳转到接受通知jsp页面

   }
}
