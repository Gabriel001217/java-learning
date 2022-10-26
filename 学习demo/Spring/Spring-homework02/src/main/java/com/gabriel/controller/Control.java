package com.gabriel.controller;

import com.gabriel.pojo.User;
import com.gabriel.service.CarService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import java.io.FileNotFoundException;
import java.util.Scanner;

@Controller("control")
public class Control {

    Scanner scanner;

    @Autowired
    CarService carService;

    public void play() throws Exception {
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
                this.add();
                play();
                break;
            case 2:
                this.del();
                play();
                break;
            case 3:
                this.update();
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

    public void add() throws Exception{
        System.out.println("请输入要增加人员的车辆型号：");
        Integer cid=scanner.nextInt();
        System.out.println("请输入人员编号：");
        Integer uid=scanner.nextInt();
        System.out.println("请输入姓名：");
        String name=scanner.next();
        System.out.println("请输入性别：");
        String sex=scanner.next();
        System.out.println("请输入邮箱：");
        String email=scanner.next();

        User user=new User(uid,name,sex,email,cid);
        int num=carService.add(user);
        if (num>0){
            System.out.println("增加成功!");
        }else {
            System.out.println("增加失败！");
        }
    }

    public void del() throws Exception{
        System.out.println("请输入要删除的成员编号：");
        Integer uid=scanner.nextInt();
        int num=carService.del(uid);
        if (num>0){
            System.out.println("删除成功！");
        }else{
            System.out.println("删除失败！");
        }
    }

    public void update() throws FileNotFoundException {
        Scanner scanner=new Scanner(System.in);
        System.out.println("请输入要修改的成员编号：");
        Integer uid=scanner.nextInt();
        System.out.println("请输入修改后的姓名：");
        String name=scanner.next();
        System.out.println("请输入修改后的性别：");
        String sex=scanner.next();
        System.out.println("请输入修改后的邮箱：");
        String email=scanner.next();
        System.out.println("请输入修改后的乘车型号：");
        Integer cid=scanner.nextInt();

        User user=new User(uid,name,sex,email,cid);
        int num=carService.update(user);
        if (num>0){
            System.out.println("修改成功！");
        }else{
            System.out.println("修改失败！");
        }
    }
}
