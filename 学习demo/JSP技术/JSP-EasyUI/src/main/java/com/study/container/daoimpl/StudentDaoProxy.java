/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.study.container.daoimpl;

import com.study.container.dao.StudentDao;
import com.study.container.pojo.Student;
import com.study.container.util.DatabaseConnectionUtil;
import java.util.List;

/**
 *
 * @author dusin
 */
public class StudentDaoProxy implements StudentDao {
    
    @Override
    public boolean doCreate(Student student) throws Exception {
        boolean flag = false;
        DatabaseConnectionUtil dbc=null;
        StudentDao dao = null;
        try {
            dbc = new DatabaseConnectionUtil();    //创建连接对象
            dao = new StudentDaoImpl(dbc.getConnection()); //创建真实对象
            flag = dao.doCreate(student);
        } catch (Exception e) {
            throw e;
        }finally{
            dbc.close();                        //关闭连接，如果有连接池，可以回收连接
            dbc=null;
            dao = null;
        }
        return flag;
    }

    @Override
    public boolean doDelete(int id) throws Exception {
        boolean flag = false;
        DatabaseConnectionUtil dbc=null;
        StudentDao dao = null;
        try {
            dbc = new DatabaseConnectionUtil();    //创建连接对象
            dao = new StudentDaoImpl(dbc.getConnection()); //创建真实对象
            flag = dao.doDelete(id);
        } catch (Exception e) {
            throw e;
        }finally{
            dbc.close();                        //关闭连接，如果有连接池，可以回收连接
            dbc=null;
            dao = null;
        }
        return flag;
    }

    @Override
    public boolean doUpdate(Student s) throws Exception {
        boolean flag = false;
        DatabaseConnectionUtil dbc=null;
        StudentDao dao = null;
        try {
            dbc = new DatabaseConnectionUtil();    //创建连接对象
            dao = new StudentDaoImpl(dbc.getConnection()); //创建真实对象
            flag = dao.doUpdate(s);
        } catch (Exception e) {
            throw e;
        }finally{
            dbc.close();                        //关闭连接，如果有连接池，可以回收连接
            dbc=null;
            dao = null;
        }
        return flag;
    }

    @Override
    public List<Student> findAll(String key,int start,int rows) throws Exception {
        
        DatabaseConnectionUtil dbc=null;
        StudentDao dao = null;
        try {
            dbc = new DatabaseConnectionUtil();    //创建连接对象
            dao = new StudentDaoImpl(dbc.getConnection()); //创建真实对象
            return dao.findAll(key,start,rows);
        } catch (Exception e) {
            throw e;
        }finally{
            dbc.close();                        //关闭连接，如果有连接池，可以回收连接
            dbc=null;
            dao = null;
        }        
    }
    
    @Override
    public int findAllCount(String key) throws Exception {
        
        DatabaseConnectionUtil dbc=null;
        StudentDao dao = null;
        try {
            dbc = new DatabaseConnectionUtil();    //创建连接对象
            dao = new StudentDaoImpl(dbc.getConnection()); //创建真实对象
            return dao.findAllCount(key);
        } catch (Exception e) {
            throw e;
        }finally{
            dbc.close();                        //关闭连接，如果有连接池，可以回收连接
            dbc=null;
            dao = null;
        }        
    }

    @Override
    public Student findById(int id) throws Exception {       
        DatabaseConnectionUtil dbc=null;
        StudentDao dao = null;
        try {
            dbc = new DatabaseConnectionUtil();    //创建连接对象
            dao = new StudentDaoImpl(dbc.getConnection()); //创建真实对象
            return dao.findById(id);
        } catch (Exception e) {
            throw e;
        }finally{
            dbc.close();                        //关闭连接，如果有连接池，可以回收连接
            dbc=null;
            dao = null;
        }        
    }
    
}
