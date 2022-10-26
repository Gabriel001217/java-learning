package com.gabriel;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MyStudent {

    private static String url = "jdbc:mysql://127.0.0.1:3306/Student";
    private static String username = "root";
    private static String password = "123456";

    public static void main(String[] args) {
        Connection connection = null;
        PreparedStatement query = null;
        Map<String, Object> student = null;
        List<Map<String, Object>> list = new ArrayList<>();

        try {
            Class.forName("com.mysql.jdbc.Driver");
            connection = DriverManager.getConnection(url, username, password);
            String sql = "select * from student";
            query = connection.prepareStatement(sql);
            ResultSet resultSet = query.executeQuery();
            while (resultSet.next()){
                student=new HashMap<>();
                student.put("ID", resultSet.getInt("ID"));
                student.put("name", resultSet.getString("name"));
                student.put("age", resultSet.getInt("age"));
                student.put("score", resultSet.getDouble("score"));
                student.put("birthday", resultSet.getDate("birthday"));
                list.add(student);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }finally {
            if (query != null) {
                try {
                    query.close();
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
