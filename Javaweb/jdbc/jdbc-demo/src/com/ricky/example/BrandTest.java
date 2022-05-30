package com.ricky.example;

import com.ricky.pojo.Brand;
import org.junit.Test;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class BrandTest {

    @Test
    public void selectAll() throws Exception {

        String url = "jdbc:mysql://localhost:3306/db1?useSSL=false";
        String username = "root";
        String password = "112233";

        Connection connection = DriverManager.getConnection(url, username, password);

        Integer id = 4;
        String brandName = "123香飘飘";
        String companyName = "456香飘飘";
        int ordered = 789;
        String description = "绕地球一圈";
        int status = 1;

        String sql = " update tb_brand\n" +
                "         set brand_name  = ?,\n" +
                "         company_name= ?,\n" +
                "         ordered     = ?,\n" +
                "         description = ?,\n" +
                "         status      = ?\n" +
                "     where id = ?";
        PreparedStatement preparedStatement = connection.prepareStatement(sql);

        preparedStatement.setString(1,brandName);
        preparedStatement.setString(2,companyName);
        preparedStatement.setInt(3,ordered);
        preparedStatement.setString(4,description);
        preparedStatement.setInt(5,status);
        preparedStatement.setInt(6,id);

        int count = preparedStatement.executeUpdate();

        System.out.println(count > 0);

        preparedStatement.close();
        connection.close();
    }


}
