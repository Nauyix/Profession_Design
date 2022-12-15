package com.bean;

public class Contract510 {
    private String con_id,house_id,mid_id,seller_id,buyer_id,house_pm,loan_type;
    double house_price;

    public String getCon_id() {
        return con_id;
    }

    public void setCon_id(String con_id) {
        this.con_id = con_id;
    }

    public String getHouse_id() {
        return house_id;
    }

    public void setHouse_id(String house_id) {
        this.house_id = house_id;
    }

    public String getmid_id() {
        return mid_id;
    }

    public void setmid_id(String mid_id) {
        this.mid_id = mid_id;
    }

    public String getSeller_id() {
        return seller_id;
    }

    public void setSeller_id(String seller_id) {
        this.seller_id = seller_id;
    }

    public String getBuyer_id() {
        return buyer_id;
    }

    public void setBuyer_id(String buyer_id) {
        this.buyer_id = buyer_id;
    }

    public String getHouse_pm() {
        return house_pm;
    }

    public void setHouse_pm(String house_pm) {
        this.house_pm = house_pm;
    }

    public String getLoan_type() {
        return loan_type;
    }

    public void setLoan_type(String loan_type) {
        this.loan_type = loan_type;
    }

    public double getHouse_price() {
        return house_price;
    }

    public void setHouse_price(double house_price) {
        this.house_price = house_price;
    }

    public double getLoan_quota() {
        return loan_quota;
    }

    public void setLoan_quota(double loan_quota) {
        this.loan_quota = loan_quota;
    }

    private double loan_quota;

    public Contract510(String con_id, String house_id, String mid_id, String seller_id, String buyer_id, double house_price, String house_pm, double loan_quota, String loan_type) {
        this.con_id = con_id;
        this.house_id = house_id;
        this.mid_id = mid_id;
        this.seller_id = seller_id;
        this.buyer_id = buyer_id;
        this.house_pm = house_pm;
        this.loan_type = loan_type;
        this.house_price = house_price;
        this.loan_quota = loan_quota;
    }
}
