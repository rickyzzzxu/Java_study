package com.ricky.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class JdbcDemo {

    public static void main(String[] args) throws Exception {

        // 1.加载mysql的驱动
        //Class.forName("com.mysql.jdbc.Driver");

        String url = "jdbc:mysql://localhost:3306/db1?useSSL=false";
        String username = "root";
        String password = "112233";
        // 2.获取连接
        Connection connection = DriverManager.getConnection(url, username, password);
        // 3.定义sql
        String sql = "select * from tb_book;";

        // 4.获取执行sql的对象statement
        //Statement statement = connection.createStatement();
        //// 5.执行sql
        //int count = statement.executeUpdate(sql);
        //
        //System.out.println("影响行数：" + count);

        Statement statement = connection.createStatement();

        ResultSet resultSet = statement.executeQuery(sql);

        while (resultSet.next()){

            int id = resultSet.getInt(1);
            String type = resultSet.getString(2);
            String name = resultSet.getString(3);

            System.out.println(id);
            System.out.println(type);
            System.out.println(name);

            System.out.println("======================");
        }

        // 6.关闭连接
        resultSet.close();
        statement.close();
        connection.close();
    }
}
