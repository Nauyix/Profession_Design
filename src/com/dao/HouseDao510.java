package com.dao;

import com.bean.House510;
import com.utils.C3p0Utils510;
import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanHandler;
import org.apache.commons.dbutils.handlers.BeanListHandler;

import java.sql.SQLException;
import java.util.List;
public class HouseDao510 {
    public List<House510> findAll() throws SQLException {
        QueryRunner runner = new QueryRunner(C3p0Utils510.getDataSource());
        String sql="select * from pd_house";
        List<House510> list=(List<House510>)runner.query(sql,new BeanListHandler<House510>(House510.class));
        return list;
    }
    public int getsize() throws SQLException {
        QueryRunner runner = new QueryRunner(C3p0Utils510.getDataSource());
        String sql="select * from pd_house";
        int maxm=0;
        List<House510> list=(List<House510>)runner.query(sql,new BeanListHandler<House510>(House510.class));
        for(int i=0;i<list.size(); i++)
        {
            maxm=maxm>list.get(i).getHouse_id()?maxm:list.get(i).getHouse_id();
        }
        return maxm;
    }
    public House510 find(int id) throws SQLException {
        QueryRunner runner = new QueryRunner(C3p0Utils510.getDataSource());
        String sql = "select * from pd_house where house_id=?";
        House510 h = (House510) runner.query(sql,new BeanHandler<House510>(House510.class),new Object[]{id});
        return h;
    }
    public Boolean insert(House510 h) throws SQLException{
        QueryRunner runner = new QueryRunner(C3p0Utils510.getDataSource());
        String sql="insert into pd_house values (?,?,?,?,?,?,?,?,?,?,?)";
        int num=runner.update(sql,new Object[] {h.getHouse_id(),h.getHouse_prov(),h.getHouse_city(),h.getHouse_dist(),h.getHouse_adds(),h.getHouse_area(),h.getHouse_price(),h.getHouse_type(),h.getHouse_age(),h.getSell_type(),h.getHouse_status()});
        if (num > 0) {
            return true;
        }
        return false;
    }
    public Boolean update(House510 h) throws SQLException {
        QueryRunner runner = new QueryRunner(C3p0Utils510.getDataSource());
        String sql="update pd_house set House_prov=?,House_city=?,House_dist=?,House_adds=?,House_area=?,House_price=?,House_type=?,House_age=?,Sell_type=?,house_status=? where house_id=?";
        int num= runner.update(sql,new Object[]{h.getHouse_prov(),h.getHouse_city(),h.getHouse_dist(),h.getHouse_adds(),h.getHouse_area(),h.getHouse_price(),h.getHouse_type(),h.getHouse_age(),h.getSell_type(),h.getHouse_status(),h.getHouse_id()});
        if(num>0) return true;
        return false;
    }
    public Boolean delete(int id) throws SQLException {
        QueryRunner runner = new QueryRunner(C3p0Utils510.getDataSource());
        String sql="delete from pd_house where house_id=?";
        int num= runner.update(sql,id);
        if (num > 0) {
            return true;
        }
        else return false;
    }
}
