package com.study.container;

import java.sql.Date;
import java.sql.ResultSet;
import java.util.List;

public interface EmployDaoInf {
    EmployPojo SetInfo(ResultSet rs);

    List<EmployPojo> FindAll();

    EmployPojo FindByID(int empno);

    boolean Update(int empno, String ename, String job, int mgr, Date hireDate, double sal, int deptno);

    boolean Insert(EmployPojo emp);

    boolean Del(int empno);

    void CloseDBC();
}
