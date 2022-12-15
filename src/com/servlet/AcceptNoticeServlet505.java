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
 * @Description: ����֪ͨ
 * @Version: 1.0
 */
@WebServlet(name="AcceptNoticeServlet505",value="/AcceptNoticeServlet505")
public class AcceptNoticeServlet505 extends HttpServlet {
   private static String jdbcDriver = "com.mysql.jdbc.Driver";// mysql��������,�����

   public static String jdbcUrl = "jdbc:mysql://localhost:3306/?serverTimezone=GMT";
   public static String jdbcUser = "root";//���ݿ��û���
   public static String jdbcPwd = "root";//���ݿ�����
   private static Connection conn;
   public static Statement st;

   static {
      try {
         Class.forName(jdbcDriver);// ����mysql������
         conn = DriverManager.getConnection(jdbcUrl, jdbcUser, jdbcPwd);
         // ��������������ַ�����ݿ��û��������봴������
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
      List<Map> list =new ArrayList<Map>();//����list�������ڴ���map�ļ�ֵ�Լ���

      String receiverId = req.getParameter("receiver_id");//����jsp����������
      System.out.println(receiverId);

      try {
         String sql ="SELECT pd_inform.`sender_id`,pd_inform.`inform_text`,pd_inform.`inform_time`\r\n"+
                 "FROM pd_inform\r\n"+
                 "WHERE pd_inform.receiver_id="+receiverId;

         ResultSet rs = st.executeQuery(sql);
         //�����ݿ��ȡ�����ݣ�����һ���������
         System.out.println("����֪ͨ");
         while (rs.next()) {
            String senderId = rs.getString("sender_id");
            String informText = rs.getString("inform_text");
            String informTime = rs.getString("inform_time");
            //��ȡ��ѭ���������ݿ�ı����Ϣ

            Map map = new HashMap();
            map.put("senderId", senderId);
            map.put("informText", informText);
            map.put("informTime", informTime);
            //����map������

            list.add(map);//��map���϶������list����

            for (Map map_1 :list) {
               System.out.println(map_1);
            }//�ڴ�ӡ̨���������ݲ鿴�Ƿ��д���

         }
      } catch (Exception e) {
         e.printStackTrace();
      }

      req.setAttribute("informList",list);//��list�������ݷ��뵽request�й���
      req.getRequestDispatcher("/acceptNotice505.jsp").forward(req, resp);
      //��ת������֪ͨjspҳ��

   }
}
