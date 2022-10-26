package com.study.container.daoimpl;

import com.study.container.dao.StudentDao;
import com.study.container.pojo.Student;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class StudentDaoImpl implements StudentDao {

    private Connection conn = null; //

    public StudentDaoImpl(Connection conn) {
        this.conn = conn; //
    }

    @Override
    public boolean doCreate(Student student) throws Exception {
        boolean flag = false;
        PreparedStatement pstmt = null;
        String sql = "insert into student(ID,name,birthday,score,major,telphone)"
                + " values(?,?,?,?,?,?)";
        try {
            pstmt = this.conn.prepareStatement(sql);
            pstmt.setInt(1, student.getId());
            pstmt.setString(2, student.getName());
            pstmt.setDate(3, (Date) student.getBirthday());
            pstmt.setFloat(4, student.getScore());
            pstmt.setString(5, student.getMajor());
            pstmt.setString(6, student.getTelphone());

            int count = pstmt.executeUpdate(); //
            if (count > 0) {
                flag = true;
            }
        } catch (Exception e) {
            throw e;
        } finally {
            try {
                pstmt.close();
            } catch (Exception e) {
            }
        }
        return flag;
    }

    @Override
    public boolean doDelete(int id) throws Exception {
        boolean flag = false;
        PreparedStatement pstmt = null;
        String sql = "DELETE FROM student WHERE id=?";
        try {
            pstmt = this.conn.prepareStatement(sql);
            pstmt.setInt(1, id);
            int count = pstmt.executeUpdate(); //
            if (count > 0) {
                flag = true;
            }
        } catch (Exception e) {
            throw e;
        } finally {
            try {
                pstmt.close();
            } catch (Exception e) {
            }
        }
        return flag;
    }

    @Override
    public boolean doUpdate(Student s) throws Exception {
        boolean flag = false;
        PreparedStatement pstmt = null;
        String sql = "UPDATE student SET name=?,birthday=?,score=?,major=?,"
                + "telphone=? WHERE id=?";
        try {
            pstmt = this.conn.prepareStatement(sql);
            pstmt.setString(1, s.getName());
            pstmt.setDate(2, (Date) s.getBirthday());
            pstmt.setFloat(3, s.getScore());
            pstmt.setString(4, s.getMajor());
            pstmt.setString(5, s.getTelphone());
            pstmt.setInt(6, s.getId());

            int count = pstmt.executeUpdate();
            if (count > 0) {
                flag = true;
            }
        } catch (Exception e) {
            throw e;
        } finally {
            try {
                pstmt.close();
            } catch (Exception e) {
            }
        }
        return flag;
    }

    @Override
    public List<Student> findAll(String key,int start,int rows) throws Exception {
        List<Student> allStudents = new ArrayList();
        PreparedStatement pstmt = null;
        String sql = "SELECT ID,name,birthday,score,major,telphone FROM student";
        if(key!=null&&!"".equals(key.trim())){
            sql = sql +" where ID like ? or name like ? or major like ? or telphone like ?";
        }
        sql = sql+" limit ?,?";
        System.out.println(sql+"?"+key);
        try {
            pstmt = this.conn.prepareStatement(sql);
            if(key!=null&&!"".equals(key.trim())){
                pstmt.setString(1, "%"+key+"%");
                pstmt.setString(2, "%"+key+"%");
                pstmt.setString(3, "%"+key+"%");
                pstmt.setString(4, "%"+key+"%");
                pstmt.setInt(5, start);
                pstmt.setInt(6, rows);
            }else{
                pstmt.setInt(1, start);
                pstmt.setInt(2, rows);
            }
            ResultSet rs = pstmt.executeQuery();
            Student s = null;
            while (rs.next()) {
                s = new Student();
                s.setId(rs.getInt("id"));
                s.setName(rs.getString("name"));
                s.setBirthday(rs.getDate("birthday"));
                s.setScore(rs.getFloat("score"));
                s.setMajor(rs.getString("major"));
                s.setTelphone(rs.getString("telphone"));
                allStudents.add(s);
            }
            rs.close();
        } catch (Exception e) {
            throw e;
        } finally {
            try {
                pstmt.close();
            } catch (Exception e) {
            }
        }
        return allStudents;
    }

    @Override
    public int findAllCount(String key) throws Exception {
        int count=0;
        PreparedStatement pstmt = null;
        String sql = "SELECT count(*) from student";
        if(key!=null&&!"".equals(key.trim())){
            sql = sql +" where ID like ? or name like ? or major like ? or telphone like ?";
        }
        System.out.println(sql+"?"+key);
        try {
            pstmt = this.conn.prepareStatement(sql);
            if(key!=null&&!"".equals(key.trim())){
                pstmt.setString(1, "%"+key+"%");
                pstmt.setString(2, "%"+key+"%");
                pstmt.setString(3, "%"+key+"%");
                pstmt.setString(4, "%"+key+"%");
            }
            ResultSet rs = pstmt.executeQuery();
            Student s = null;
            if (rs.next()) {
                count = rs.getInt(1);
            }
            rs.close();
        } catch (Exception e) {
            throw e;
        } finally {
            try {
                pstmt.close();
            } catch (Exception e) {
            }
        }
        return count;
    }

    @Override
    public Student findById(int id) throws Exception {
        Student s = null;
        PreparedStatement pstmt = null;
        String sql = "SELECT ID,name,birthday,score,major,telphone "
                + "FROM student where id=?";
        try {
            pstmt = this.conn.prepareStatement(sql);
            pstmt.setInt(1, id);
            ResultSet rs = pstmt.executeQuery();
            if (rs.next()) { //
                s = new Student();
                s.setId(rs.getInt("id"));
                s.setName(rs.getString("name"));
                s.setBirthday(rs.getDate("birthday"));
                s.setScore(rs.getFloat("score"));
                s.setMajor(rs.getString("major"));
                s.setTelphone(rs.getString("telphone"));
            }
            rs.close();
        } catch (Exception e) {
            throw e;
        } finally {
            try {
                pstmt.close();
            } catch (Exception e) {
            }
        }
        return s;
    }
}

