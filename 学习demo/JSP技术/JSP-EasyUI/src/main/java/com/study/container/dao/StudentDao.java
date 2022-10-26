package com.study.container.dao;

import com.study.container.pojo.Student;

import java.util.List;

public interface StudentDao {

    boolean doCreate(Student student) throws Exception;

    boolean doDelete(int id) throws Exception;

    boolean doUpdate(Student s) throws Exception;

    List<Student> findAll(String key, int start, int rows) throws Exception;
    int findAllCount(String key) throws Exception;

    Student findById(int id) throws Exception;
}
