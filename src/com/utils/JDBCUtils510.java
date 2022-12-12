package com.utils;
import java.sql.*;
public class JDBCUtils510 {
    public static Connection getConnection() throws SQLException,ClassNotFoundException{
        Class.forName("com.mysql.jdbc.Driver");
        String url="jdbc:mysql://localhost:3306/jdbc";
        String usn="ProDes";
        String pwd="Pwd@502";
        Connection conn=DriverManager.getConnection(url, usn , pwd);
        return conn;
    }
    public static void release(Statement stmt, Connection conn){
        if(stmt!=null){
            try{
                stmt.close();
            }catch (SQLException e) {
                e.printStackTrace();
            }
            stmt=null;
        }
    }
    public static void release(ResultSet rs,Statement stmt,Connection conn){
        if(rs!=null){
            try{
                rs.close();
            }catch (SQLException e) {
                e.printStackTrace();
            }
            rs=null;
        }
        release(stmt,conn);
    }
}
