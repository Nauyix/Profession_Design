package com.servlet;

import com.bean.User510;
import com.dao.UserDao510;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.io.OutputStream;
import java.sql.SQLException;
import java.util.ArrayList;
import java.lang.*;
import java.util.*;

import static java.lang.Math.pow;

@WebServlet(name = "LoanCalculateServlet510", value = "/LoanCalculateServlet510")
public class LoanCalculateServlet510 extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doPost(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        double price;
        price=Double.parseDouble(req.getParameter("price"));
        int first,year;
        first=Integer.parseInt(req.getParameter("first"));
        year=Integer.parseInt(req.getParameter("limit"));
        String type=req.getParameter("type");
        String proj=req.getParameter("proj");
        price=price*(10-first)*0.1;
        year*=12;
        List l=new ArrayList<Double>();
        double ll=1;
        if(type.equals("business")) ll=0.049;
        else if(type.equals("provident")) ll=0.0325;
        req.getSession().setAttribute("price",String.valueOf(price));
        req.getSession().setAttribute("time",String.valueOf(year));
        if(proj.equals("capital")){//等额本金
            double month_price=price/year;
            for(int i=1;i<=year;i++)
            {
                double interest=price*(ll/12);
                l.add(month_price+interest);
                price-=month_price;
            }
        }
        else if (proj.equals("interest")) {//等额本息
            double payback=price*(ll/12)*pow((1+ll/12),year)/(pow((1+ll/12),year-1));
            for(int i=1;i<=year;i++)
            {
                l.add(payback);
            }
        }
        else{//something went wrong?
            resp.sendRedirect("Wrong510.jsp");
        }
        //outputStream ot=resp.getOutputStream();
        //ot.write("qwqwqwqwq".getBytes());
        System.out.println("Servlet正在运行"+year+" "+price);
        req.getSession().setAttribute("interest",l);
        String url = "loan_viewresult510.jsp";
        req.getRequestDispatcher(url).forward(req,resp);


    }
}
/*
等额本息：
每月还款额=每月还款本金+每月还款利息
每月还款本金=贷款总额/贷款月数
每月还款利息=贷款本金余额*贷款月利率(贷款月利率=年利率/12)
贷款本金余额=贷款总额-已还款月数*每月还款本金。

等额本金：
每月应还款额=借款本金×月利率×(1+月利率)^还款月数/[(1+月利率)^还款月数-1];
总还款额=每期还款额*还款月数。
*/