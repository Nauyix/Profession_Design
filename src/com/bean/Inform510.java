package com.bean;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.text.*;
import java.util.Date;

public class Inform510 {
    public String getInform_id() {
        return inform_id;
    }

    public void setInform_id(String inform_id) {
        this.inform_id = inform_id;
    }

    public String getSender_id() {
        return sender_id;
    }

    public void setSender_id(String sender_id) {
        this.sender_id = sender_id;
    }

    public String getReceiver_id() {
        return receiver_id;
    }

    public void setReceiver_id(String receiver_id) {
        this.receiver_id = receiver_id;
    }

    public String getInform_text() {
        return inform_text;
    }

    public void setInform_text(String inform_text) {
        this.inform_text = inform_text;
    }
    private String inform_id,sender_id,receiver_id,inform_text;

    public void setInform_time(String inform_time) {
        this.inform_time = inform_time;
    }
    private String inform_time;
    public String getInform_time() {
        return new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(inform_time);
    }
//    public void setInform_time(String inform_time) {//使用String以yyyy-MM-dd HH:mm:ss形式传入
//        SimpleDateFormat f=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
//        try {
//            this.inform_time = f.parse(inform_time);
//        } catch (ParseException e) {
//            e.printStackTrace();
//        }
//    }
}
