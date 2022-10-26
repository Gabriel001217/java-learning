package com.gabriel.service;

import com.gabriel.dao.CarDao;
import com.gabriel.pojo.Car;

import java.util.ArrayList;
import java.util.Scanner;

public class CarService {

    Scanner scanner;
    ArrayList<Car> carList;
    CarDao carDao;

    public CarService(ArrayList<Car> carList,CarDao carDao) {
        this.carList = carList;
        this.carDao = carDao;
    }

    public CarService() {

    }

    public void play(){
        System.out.println("***************************");
        System.out.println("请选择要进行的操作：");
        System.out.println("1、增加");
        System.out.println("2、删除");
        System.out.println("3、修改");
        System.out.println("4、退出");
        scanner=new Scanner(System.in);
        int choose=scanner.nextInt();
        switch (choose){
            case 1:
                add();
                play();
                break;
            case 2:
                del();
                play();
                break;
            case 3:
                update();
                play();
                break;
            case 4:
                System.out.println("退出！");
                break;
            default:
                System.out.println("请重新选择！");
                play();
                break;
        }
    }

    private Car show(){
        scanner=new Scanner(System.in);
        System.out.println("请输入要操作的车的品牌:");
        String carBrand=scanner.next();

        for (Car car : carList) {
            if (carBrand.equals(car.getBrand()))
                return car;
        }
        return null;
    }

    public void add(){
        Car car=show();
        System.out.println("请输入要增加的乘车人员：");
        scanner=new Scanner(System.in);
        String name=scanner.next();
        if(carDao.add(car, name)){
            System.out.println("service增加成功");
        }
    }

    public void del(){
        Car car=show();
        System.out.println(car.getList());
        System.out.println("请输入要删除的乘车人员：");
        scanner=new Scanner(System.in);
        String name=scanner.next();
        if (carDao.del(car, name)){
            System.out.println("service删除成功");
        }
    }

    public void update(){
        Car car=show();
        System.out.println("请输入要修改的人的姓名：");
        scanner=new Scanner(System.in);
        String oldName=scanner.next();
        System.out.println("请输入修改后的姓名：");
        String newName=scanner.next();
        if (carDao.update(car,oldName,newName)){
            System.out.println("service修改成功");
        }
    }
}
