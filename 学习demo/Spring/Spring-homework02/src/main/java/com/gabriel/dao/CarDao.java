package com.gabriel.dao;

import com.gabriel.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.support.JdbcDaoSupport;
import org.springframework.stereotype.Repository;

import javax.sql.DataSource;

@Repository("carDao")
public class CarDao extends JdbcDaoSupport {

    @Autowired
    public void init(DataSource dataSource) {
        super.setDataSource(dataSource);
    }

    public int insert(User user){
        String sql="insert into user values(?,?,?,?,?)";
        return getJdbcTemplate().update(sql,user.getUid(),user.getName(),user.getSex(),user.getEmail(),user.getCid());
    }

    public int del(int uid){
        String sql="delete from user where uid="+uid;
        return getJdbcTemplate().update(sql);
    }

    public int update(User user){
        String sql="update user set name=?,sex=?,email=?,cid=? where uid=?";
        return getJdbcTemplate().update(sql,user.getName(),user.getSex(),user.getEmail(),user.getCid(),user.getUid());
    }
}
