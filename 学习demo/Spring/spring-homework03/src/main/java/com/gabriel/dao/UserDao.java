package com.gabriel.dao;

import com.gabriel.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.support.JdbcDaoSupport;
import org.springframework.stereotype.Repository;

import javax.sql.DataSource;
import java.util.List;

@Repository("userDao")
public class UserDao extends JdbcDaoSupport {

    @Autowired
    public void init(DataSource dataSource){
        super.setDataSource(dataSource);
    }

    public List<User> findAll(){

        String sql="select * from myuser";
        return super.getJdbcTemplate().query(sql, new BeanPropertyRowMapper(User.class));
    }

    public int add(User user){

        String sql="insert into myuser values(?,?,?,?)";
        return super.getJdbcTemplate().update(sql,user.getUid(),user.getUsername(),user.getSex(),user.getEmail());
    }

    public int del(Integer uid){
        String sql="delete from myuser where uid=?";
        return super.getJdbcTemplate().update(sql,uid);
    }

    public int update(User user){
        String sql="update myuser set username=?,sex=?,email=? where uid=?";
        return getJdbcTemplate().update(sql,user.getUsername(),user.getSex(),user.getEmail(),user.getUid());
    }
}
