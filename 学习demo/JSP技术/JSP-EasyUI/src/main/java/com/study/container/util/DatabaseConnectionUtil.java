package com.study.container.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseConnectionUtil {
    //java DB数据库
    /*private String DBDRIVER = "org.apache.derby.jdbc.ClientDriver";
    private String DBURL = "jdbc:derby://localhost:1527/Study";
    private String DBUSER = "sa";
    private String DBPASSWORD = "sa123";*/

    //MySQL数据库
    private String DBDRIVER = "com.mysql.jdbc.Driver";   //数据库驱动，根据所用数据库确定。不知道的可以百度搜索下
    private String DBURL = "jdbc:mysql://localhost:3306/student?serverTimezone=GMT%2B8"; //数据库连接字符串，根据数据库不同而不同。
    private String DBUSER = "root";    //
    private String DBPASSWORD = "123456";

    private Connection conn = null;


    public DatabaseConnectionUtil() throws ClassNotFoundException, SQLException {
        Class.forName(DBDRIVER);
        this.conn = DriverManager.getConnection(DBURL, DBUSER, DBPASSWORD);
    }

    public Connection getConnection() throws SQLException {
        if (conn == null || conn.isClosed()) {
            conn = DriverManager.getConnection(DBURL, DBUSER, DBPASSWORD);
        }
        return this.conn;
    }

    public void close() {
        if (this.conn != null) {
            try {
                this.conn.close();
                conn = null;
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
}
