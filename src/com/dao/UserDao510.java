package com.dao;

import com.bean.User510;
import com.utils.C3p0Utils510;
import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanHandler;
import org.apache.commons.dbutils.handlers.BeanListHandler;

import java.sql.SQLException;
import java.util.List;

public class UserDao510 {
    public List<User510> findAll() throws SQLException {
        QueryRunner runner = new QueryRunner(C3p0Utils510.getDataSource());
        String sql="select * from pd_user";
        List<User510> list=(List<User510>)runner.query(sql,new BeanListHandler<User510>(User510.class));
        return list;
    }
    public User510 find(int id) throws SQLException {
        QueryRunner runner = new QueryRunner(C3p0Utils510.getDataSource());
        String sql = "select * from pd_user where user_id=?";
        User510 User510 = (User510) runner.query(sql,new BeanHandler<User510>(User510.class),new Object[]{id});
        return User510;
    }
    public Boolean insert(User510 u) throws SQLException{
        QueryRunner runner = new QueryRunner(C3p0Utils510.getDataSource());
        String sql="insert into pd_user(user_id,user_name,user_pwd,user_tel,user_email,user_type) values (?,?,?,?,?,?)";
        int num=runner.update(sql,new Object[] {u.getUser_id(),u.getUser_name(),u.getUser_pwd(),u.getUser_tel(),u.getUser_email(),u.getUser_type()});
        if (num > 0) {
            return true;
        }
        return false;
    }
    public Boolean update(User510 u) throws SQLException {
        QueryRunner runner = new QueryRunner(C3p0Utils510.getDataSource());
        String sql="update pd_user set user_name=?,user_pwd=?,user_tel=?,user_email=?,user_type=? where user_id=?";
        int num= runner.update(sql,new Object[]{u.getUser_name(),u.getUser_pwd(),u.getUser_tel(),u.getUser_email(),u.getUser_type(),u.getUser_id()});
        if(num>0) return true;
        return false;
    }
    public Boolean delete(int id) throws SQLException {
        QueryRunner runner = new QueryRunner(C3p0Utils510.getDataSource());
        String sql="delete from pd_user where user_id=?";
        int num= runner.update(sql,id);
        if (num > 0) {
            return true;
        }
        else return false;
    }
    public int getSize() throws SQLException {
        QueryRunner runner = new QueryRunner(C3p0Utils510.getDataSource());
        String sql="select * from pd_user";
        List<User510> list=(List<User510>)runner.query(sql,new BeanListHandler<User510>(User510.class));
        return list.size();
    }
    public boolean isUsernameExist614(String user_name) throws SQLException {
        QueryRunner runner = new QueryRunner(C3p0Utils510.getDataSource());
        String sql = "select * from pd_user where user_name = ?";
        User510 user = runner.query(sql,new BeanHandler<User510>(User510.class),user_name);
        if(user == null){
            return false;
        }else{
            return true;
        }


    }

    public User510 login614(String name, String pwd) throws SQLException {
        QueryRunner runner = new QueryRunner(C3p0Utils510.getDataSource());
        String sql = "select * from pd_user where user_name = ? and user_pwd = ?";
        User510 user = runner.query(sql,new BeanHandler<User510>(User510.class),name,pwd);
        return user;
    }
}
