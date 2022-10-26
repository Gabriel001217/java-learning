package com.study.container;

import java.sql.*;

public class DatabaseConnectionUtil {

    public static String url="jdbc:mysql://localhost:3306/student?serverTimezone=GMT%2B8";
    public static String driverName="com.mysql.cj.jdbc.Driver";
    public static String user="root";
    public static String password="123456";

    public DatabaseConnectionUtil() { }

    static{
        try {
            Class.forName(driverName);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    public Connection GetConnection() throws SQLException {
        return DriverManager.getConnection(url, user, password);
    }

    public void Close(Connection conn, Statement stmt, ResultSet rs){

        if(rs!=null){
            try {
                rs.close();
            }catch (Exception e){
                e.printStackTrace();
            }
        }
        if(stmt!=null){
            try {
                stmt.close();
            }catch (Exception e){
                e.printStackTrace();
            }
        }
        if(conn!=null){
            try {
                conn.close();
            }catch (Exception e){
                e.printStackTrace();
            }
        }

    }
}
