package com.study.jsp;

public class Main {
    public static void main(String[] args) {

        DatabaseConnectionUtil dbc=new DatabaseConnectionUtil();
        EmployManger employManger=new EmployManger(dbc);
        employManger.Start();
    }
}
