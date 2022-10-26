package com.study.container;

import java.sql.ResultSet;
import java.util.List;

public interface EmployDaoInf {
    EmployPojo SetInfo(ResultSet rs);

    List<EmployPojo> FindAll();

    EmployPojo FindByID(int empno);

    boolean Update(int empno, int choose, String attribute, String info);

    boolean Insert(EmployPojo emp);

    boolean Del(int empno);

    void CloseDBC();
}
