package com.study.container;

import java.sql.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

public class EmployDAO implements EmployDaoInf {

    private DatabaseConnectionUtil dbc;
    private Connection conn=null;
    private PreparedStatement pst=null;
    private ResultSet rs=null;
    private EmployPojo emp=null;
    private List<EmployPojo> empList;

    public EmployDAO() {
    }

    public EmployDAO(DatabaseConnectionUtil dbc) {

        try {
            this.dbc=dbc;
            this.conn=dbc.GetConnection();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Override
    public EmployPojo SetInfo(ResultSet rs){

        try{

            emp=new EmployPojo();
            emp.setEmpno(rs.getInt("empno"));
            emp.setEname(rs.getString("ename"));
            emp.setJob(rs.getString("job"));
            emp.setMgr(rs.getInt("mgr"));
            emp.setHireDate(rs.getDate("hiredate"));
            emp.setSal(rs.getDouble("sal"));
            emp.setDeptno(rs.getInt("deptno"));

        }catch (SQLException e){
            e.printStackTrace();
        }

        return emp;
    }

    @Override
    public List<EmployPojo> FindAll(){

        try {

            empList=new ArrayList<>();
            String sql="select * from emp";
            pst=conn.prepareStatement(sql);
            rs=pst.executeQuery();
            while (rs.next()){
                emp=SetInfo(rs);
                empList.add(emp);
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }

        return empList;
    }

    @Override
    public EmployPojo FindByID(int empno){

        try {

            String sql="select * from emp where empno = ?";
            pst=conn.prepareStatement(sql);
            pst.setInt(1, empno);
            rs=pst.executeQuery();
            if(rs.next()){
                emp=SetInfo(rs);
            }else{
                emp=null;
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }

        return emp;
    }

    @Override
    public boolean Update(int empno, int choose, String attribute, String info){

        boolean flag=false;
        try {

            String sql="update emp set "+attribute+" = ? where empno = ?";
            pst=conn.prepareStatement(sql);
            switch (choose){
                case 1:
                    pst.setString(1, info);
                    break;
                case 2:
                    pst.setString(1, info);
                    break;
                case 3:
                    pst.setInt(1, Integer.parseInt(info));
                    break;
                case 4:
                    try {
                        SimpleDateFormat dateFormat=new SimpleDateFormat("yyyy-MM-dd");
                        pst.setDate(1, new Date(dateFormat.parse(info).getTime()));
                    } catch (ParseException e) {
                        e.printStackTrace();
                    }
                    break;
                case 5:
                    pst.setDouble(1, Double.parseDouble(info));
                    break;
                case 6:
                    pst.setInt(1, Integer.parseInt(info));
                    break;
            }
            pst.setInt(2, empno);
            int rows=pst.executeUpdate();
            if (rows>0){
                flag=true;
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }

        return flag;
    }

    @Override
    public boolean Insert(EmployPojo emp){

        boolean flag=false;
        try {
            String sql="insert into emp(empno,ename,job,mgr,hiredate,sal,deptno) values(?,?,?,?,?,?,?)";
            pst=conn.prepareStatement(sql);
            pst.setInt(1, emp.getEmpno());
            pst.setString(2, emp.getEname());
            pst.setString(3, emp.getJob());
            pst.setInt(4, emp.getMgr());
            pst.setDate(5, new Date(emp.getHireDate().getTime()));
            pst.setDouble(6, emp.getSal());
            pst.setInt(7, emp.getDeptno());

            int rows=pst.executeUpdate();
            if(rows>0){
                flag=true;
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }

        return flag;
    }

    @Override
    public boolean Del(int empno){

        boolean flag=false;
        try {

            String sql="delete from emp where empno=?";
            pst=conn.prepareStatement(sql);
            pst.setInt(1, empno);
            int rows=pst.executeUpdate();
            if (rows>0){
                flag=true;
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }

        return flag;
    }

    @Override
    public void CloseDBC(){
        dbc.Close(conn, pst, rs);
    }
}
