package com.gabriel.service;

import com.gabriel.dao.CarDao;
import com.gabriel.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.FileNotFoundException;
import java.io.FileReader;

@Service("carService")
public class CarService {

    @Autowired
    private CarDao carDao;

    public int add(User user) throws FileNotFoundException{
        int num=carDao.insert(user);
        //FileReader fr=new FileReader("d:/file");
        return num;
    }

    public int del(int uid) throws FileNotFoundException{
        int num=carDao.del(uid);
        //FileReader fr=new FileReader("d:/file");
        return num;
    }

    public int update(User user) throws FileNotFoundException {
        int num=carDao.update(user);
        //FileReader fr=new FileReader("d:/file");
        return num;
    }
}
