package com.study.jsp;

import java.util.Date;

public class EmployPojo {

    //员工编号
    private int empno;
    //员工姓名
    private String ename;
    //员工职务
    private String job;
    //员工上司编号
    private int mgr;
    //员工入职日期
    private Date hireDate;
    //员工工资
    private double sal;
    //员工部门编号
    private int deptno;

    public EmployPojo() {
    }

    public EmployPojo(int empno, String ename, String job, int mgr, Date hireDate, double sal, int deptno) {
        this.empno = empno;
        this.ename = ename;
        this.job = job;
        this.mgr = mgr;
        this.hireDate = hireDate;
        this.sal = sal;
        this.deptno = deptno;
    }

    public int getEmpno() {
        return empno;
    }

    public void setEmpno(int empno) {
        this.empno = empno;
    }

    public String getEname() {
        return ename;
    }

    public void setEname(String ename) {
        this.ename = ename;
    }

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }

    public int getMgr() {
        return mgr;
    }

    public void setMgr(int mgr) {
        this.mgr = mgr;
    }

    public Date getHireDate() {
        return hireDate;
    }

    public void setHireDate(Date hireDate) {
        this.hireDate = hireDate;
    }

    public double getSal() {
        return sal;
    }

    public void setSal(double sal) {
        this.sal = sal;
    }

    public int getDeptno() {
        return deptno;
    }

    public void setDeptno(int deptno) {
        this.deptno = deptno;
    }
}
