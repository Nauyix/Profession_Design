package com.bean;

import java.sql.SQLException;

public class User510 {
    public String getUser_name() {
        return user_name;
    }

    public void setUser_name(String user_name) {
        this.user_name = user_name;
    }

    public int getUser_id() {
        return user_id;
    }

    public void setUser_id(int user_id) {
        this.user_id = user_id;
    }

    public String getUser_pwd() {
        return user_pwd;
    }

    public void setUser_pwd(String user_pwd) {
        this.user_pwd = user_pwd;
    }

    public String getUser_tel() {
        return user_tel;
    }

    public void setUser_tel(String user_tel) {
        this.user_tel = user_tel;
    }

    public String getUser_email() {
        return user_email;
    }

    public void setUser_email(String user_email) {
        this.user_email = user_email;
    }
    public int getUser_type() {
        return user_type;
    }

    public void setUser_type(int user_type) {
        this.user_type = user_type;
    }
    public User510(){
        super();
    }
    private String user_name;
    private int user_id;
    private String user_pwd;
    private String user_tel;
    private String user_email;
    private int user_type;

    public User510(int user_id,String user_name, String user_pwd, String user_tel, String user_email, int user_type) {
        this.user_id = user_id;
        this.user_name = user_name;
        this.user_pwd = user_pwd;
        this.user_tel = user_tel;
        this.user_email = user_email;
        this.user_type = user_type;
    }
}
