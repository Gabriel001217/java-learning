package com.gabriel;

import java.math.BigDecimal;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class MyJDBC {

    private static String url = "jdbc:mysql://127.0.0.1:3306/bank";
    private static String username = "root";
    private static String password = "123456";

    public static void main(String[] args) {
        Connection connection = null;
        PreparedStatement updateBalance = null;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            connection = DriverManager.getConnection(url, username, password);
            connection.setAutoCommit(false);
            String sql = "update account set balance = balance + ? where ID = ?";
            updateBalance = connection.prepareStatement(sql);
            updateBalance.setBigDecimal(1, BigDecimal.valueOf(-1000));
            updateBalance.setInt(2, 1);
            int flag = updateBalance.executeUpdate();
            if (flag == 1) {
                updateBalance.setBigDecimal(1, BigDecimal.valueOf(1000));
                updateBalance.setInt(2, 2);
                updateBalance.executeUpdate();
                connection.commit();
            } else {
                connection.rollback();
            }
        } catch (Exception e) {
            e.printStackTrace();
            if (connection != null) {
                try {
                    connection.rollback();     //有异常，回滚
                } catch (SQLException excep) {
                    excep.printStackTrace();
                }
            }
        } finally {
            if (updateBalance != null) {
                try {
                    updateBalance.close();
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
            if (connection != null) {
                try {
                    connection.close();
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
