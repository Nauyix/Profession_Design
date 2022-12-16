package com.dao;

import com.bean.Contract510;
import com.bean.Contract510;
import com.utils.C3p0Utils510;
import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanHandler;
import org.apache.commons.dbutils.handlers.BeanListHandler;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

public class ContractDao510 {
    public List<Contract510> findAll() throws SQLException {
        QueryRunner runner = new QueryRunner(C3p0Utils510.getDataSource());
        String sql="select * from pd_contract";
        List<Contract510> list=(List<Contract510>)runner.query(sql,new BeanListHandler<Contract510>(Contract510.class));
        return list;
    }
    public Contract510 find(int id) throws SQLException {
        QueryRunner runner = new QueryRunner(C3p0Utils510.getDataSource());
        String sql = "select * from pd_contract where con_id=?";
        Contract510 c = (Contract510) runner.query(sql,new BeanHandler<Contract510>(Contract510.class),new Object[]{id});
        return c;
    }
    public Boolean insert(Contract510 c) throws SQLException{
        QueryRunner runner = new QueryRunner(C3p0Utils510.getDataSource());
        String sql="insert into pd_contract(con_id,house_id,mid_id,seller_id,buyer_id,house_price,house_pm,loan_quota,loan_type) values (?,?,?,?,?,?,?,?,?)";
        int num=runner.update(sql,new Object[] {c.getCon_id(),c.getHouse_id(),c.getmid_id(),c.getSeller_id(),c.getBuyer_id(),c.getHouse_price(),c.getHouse_pm(),c.getLoan_quota(),c.getLoan_type()});
        if (num > 0) {
            return true;
        }
        return false;
    }
    public Boolean update(Contract510 c) throws SQLException {
        QueryRunner runner = new QueryRunner(C3p0Utils510.getDataSource());
        String sql="update pd_contract set house_id=?,mid_id=?,seller_id=?,buyer_id=?,house_price=?,house_pm=?,loan_quota=?,loan_type=? where con_id=?";
        int num= runner.update(sql,new Object[]{c.getHouse_id(),c.getmid_id(),c.getSeller_id(),c.getBuyer_id(),c.getHouse_price(),c.getHouse_pm(),c.getLoan_quota(),c.getLoan_type(),c.getCon_id()});
        if(num>0) return true;
        return false;
    }
    public Boolean delete(int id) throws SQLException {
        QueryRunner runner = new QueryRunner(C3p0Utils510.getDataSource());
        String sql="delete from pd_contract where con_id=?";
        int num= runner.update(sql,id);
        if (num > 0) {
            return true;
        }
        else return false;
    }
}
