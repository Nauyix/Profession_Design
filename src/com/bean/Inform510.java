package com.bean;

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

    public double getInform_type() {
        return inform_type;
    }

    public void setInform_type(double inform_type) {
        this.inform_type = inform_type;
    }

    String inform_id,sender_id,receiver_id,inform_text;
    double inform_type;
}
