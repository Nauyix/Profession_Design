package com.service;

import com.bean.User510;
import com.dao.UserDao510;

import java.sql.SQLException;

public class UserService614 {
    private UserDao510 uDao = new UserDao510();
    //注册
    public boolean register(User510 user) throws SQLException {
        //用户是否注册
        if(uDao.isUsernameExist614(user.getUser_name())){
           return false;
        }
        uDao.insert(user);
        return true;
    }
    //登录
    public User510 login(String name,String pwd) throws SQLException {
        User510 user = null;
        user = uDao.login614(name, pwd);
        System.out.println("In UserService"+user+"qwq "+name+" qwq "+pwd);
        return user;
    }
}
