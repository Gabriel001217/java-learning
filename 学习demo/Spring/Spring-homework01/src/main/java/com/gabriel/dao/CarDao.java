package com.gabriel.dao;

import com.gabriel.pojo.Car;

import java.util.ArrayList;

public class CarDao {

    ArrayList<String> lst;
    public CarDao() {
    }

    public boolean add(Car car,String name){
        lst= car.getList();
        lst.add(name);
        car.setList(lst);
        return true;
    }

    public boolean del(Car car,String name){
        lst=car.getList();
        lst.remove(name);
        car.setList(lst);
        return true;
    }

    public boolean update(Car car,String oldName,String newName){
        lst=car.getList();
        for (String s : lst) {
            if (oldName.equals(s)){
                lst.set(lst.indexOf(s), newName);
            }
        }
        return true;
    }
}
