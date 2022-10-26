package com.study.jsp;

import java.sql.Connection;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class EmployManger {

    private EmployPojo emp;
    private EmployDAO employDAO;
    private List<EmployPojo> empList;
    Scanner scanner = new Scanner(System.in);
    Connection conn;

    public EmployManger(DatabaseConnectionUtil dbc) {

        try {
            this.conn=dbc.GetConnection();
            employDAO=new EmployDAO(dbc);
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }

    public static void ShowChoice(){
        System.out.println("Enter your choice");
        System.out.println("1 - list all employees");
        System.out.println("2 - find employee by its id");
        System.out.println("3 - update an employee");
        System.out.println("4 - add a new employee");
        System.out.println("5 - delete an employee by id");
        System.out.println("6 - end program");
        System.out.println("?");
    }

    public void Start(){

        ShowChoice();
        int choice = scanner.nextInt();
        switch (choice){
            case 1:
                ShowEmps();
                Start();
                break;
            case 2:
                ShowEmpByID();
                Start();
                break;
            case 3:
                UpdateEmp();
                Start();
                break;
            case 4:
                AddEmp();
                Start();
                break;
            case 5:
                DelEmp();
                Start();
                break;
            case 6:
                CloseSystem();
                break;
        }

    }

    public void ShowEmps(){

        empList=employDAO.FindAll();
        for(EmployPojo emp:empList){
            System.out.println("员工编号:"+emp.getEmpno()+"\t"+"姓名:"+emp.getEname()+"\t"+"职务:"+emp.getJob()+"\t"
                    +"上司编号:"+emp.getMgr()+"\t"+"入职日期:"+emp.getHireDate()+"\t"+"工资:"+emp.getSal()+"\t"+"部门编号:"+emp.getDeptno());
        }

    }

    public void ShowEmpByID(){

        System.out.println("请输入想要查询的员工编号:");
        int empno=scanner.nextInt();
        emp=employDAO.FindByID(empno);
        if (emp!=null){
            System.out.println("员工编号:"+emp.getEmpno()+"\t"+"姓名:"+emp.getEname()+"\t"+"职务:"+emp.getJob()+"\t"
                    +"上司编号:"+emp.getMgr()+"\t"+"入职日期:"+emp.getHireDate()+"\t"+"工资:"+emp.getSal()+"\t"+"部门编号:"+emp.getDeptno());
        }else{
            System.out.println("查询不到该员工！");
        }
    }

    public void UpdateEmp(){

        System.out.println("请输入要更新信息的员工编号：");
        int empno=scanner.nextInt();
        System.out.println("请选择要更新的属性：1、姓名  2、职务  3、上司编号  4、入职日期  5、工资  6、部门编号");
        int choose=scanner.nextInt();
        String attribute=null;
        System.out.println("请输入更新后的内容：");
        String info=scanner.next();
        switch (choose){
            case 1:
                attribute="ename";
                break;
            case 2:
                attribute="job";
                break;
            case 3:
                attribute="mgr";
                break;
            case 4:
                attribute="hiredate";
                break;
            case 5:
                attribute="sal";
                break;
            case 6:
                attribute="deptno";
                break;
        }
        boolean flag = employDAO.Update(empno, choose,attribute,info);
        if (flag){
            System.out.println("更新成功！");
        }else{
            System.out.println("更新失败！");
        }
    }

    public void AddEmp(){

        System.out.println("请输入想要增加的员工的信息:");
        System.out.println("1、员工编号：");
        int empno=scanner.nextInt();
        System.out.println("2、员工姓名：");
        String ename=scanner.next();
        System.out.println("3、员工职务：");
        String job=scanner.next();
        System.out.println("4、上司编号：");
        int mgr=scanner.nextInt();
        System.out.println("5、入职日期：");
        String input=scanner.next();
        Date hireDate=null;
        try {
            SimpleDateFormat dateFormat=new SimpleDateFormat("yyyy-MM-dd");
            hireDate=dateFormat.parse(input);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        System.out.println("6、员工工资：");
        double sal=scanner.nextDouble();
        System.out.println("7、部门编号：");
        int deptno=scanner.nextInt();

        emp=new EmployPojo(empno,ename,job,mgr,hireDate,sal,deptno);
        boolean flag=employDAO.Insert(emp);
        if (flag){
            System.out.println("插入数据成功！");
        }else{
            System.out.println("插入数据失败！");
        }
    }

    public void DelEmp(){

        System.out.println("请输入要删除的员工编号：");
        int empno=scanner.nextInt();
        boolean flag=employDAO.Del(empno);
        if (flag){
            System.out.println("删除成功！");
        }else{
            System.out.println("删除失败！");
        }
    }

    public void CloseSystem(){
        employDAO.CloseDBC();
        System.out.println("数据库资源已释放！");
        System.out.println("系统已关闭！");
    }
}
