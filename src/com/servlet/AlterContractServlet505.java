package com.servlet;

import com.bean.Contract510;
import com.dao.ContractDao510;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.swing.*;
import java.awt.*;
import java.io.IOException;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @BelongsProject: Profession_Design
 * @BelongsPackage: com.servlet
 * @Classname: AlterContractServlet
 * @Author: Bianca
 * @CreateTime: 2022-12-14  00:44
 * @Description: 变更合同
 * @Version: 1.0
 */
@WebServlet(name="AlterContractServlet505",value="/AlterContractServlet505")
public class AlterContractServlet505 extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doPost(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setCharacterEncoding("utf-8");
        resp.setContentType("text/html;charset=utf-8");

        Date date = new Date();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String time = sdf.format(date);

        String buyerId=req.getParameter("buyer_id");
        String sellerId=req.getParameter("seller_id");
        String midId=req.getParameter("mid_id");
        String houseId=req.getParameter("house_id");
        double housePrice=Double.parseDouble(req.getParameter("house_price"));
        String housePm=req.getParameter("house_pm");
        String loanType=req.getParameter("loan_type");
        double loanQuota=Double.parseDouble(req.getParameter("loan_quota"));

        StringBuilder sb = new StringBuilder();

        sb.append(time.substring(2,4));
        sb.append(time.substring(5,7));
        sb.append(time.substring(8,10));
        sb.append(subStringID(sellerId));
        sb.append(subStringID(midId));
        String conID = sb.toString();

        Frame frame=new Frame();
        frame.setAlwaysOnTop(true);//将弹窗放在最前面

        try {
            ContractDao510 dao505 = new ContractDao510();
            Contract510 contract505 = new Contract510(conID,houseId,midId,sellerId,buyerId,housePrice,housePm,loanQuota,loanType);
            if(dao505.update(contract505)){
                JOptionPane.showMessageDialog((Component)frame, "更改成功","提示",2);
                resp.sendRedirect("userindex614.jsp");
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog((Component)frame, "更改失败","提示",2);
            resp.sendRedirect("alterContract505.jsp");
            throw new RuntimeException(e);
        }
    }
    private String subStringID(String stringID){
        while (stringID.length()<=2){
            if(stringID.length()==2) return stringID;
            stringID = "0"+stringID;
        }
        return stringID.substring(stringID.length()-2,stringID.length());
    }
}
