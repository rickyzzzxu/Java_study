package com.ricky.web.servlet.old;

import com.alibaba.fastjson.JSON;
import com.ricky.pojo.Brand;
import com.ricky.service.BrandService;
import com.ricky.service.impl.BrandServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

//@WebServlet("/addServlet")
public class AddServlet extends HttpServlet {

    private BrandService brandService = new BrandServiceImpl();

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        String params = request.getReader().readLine();

        /*BufferedReader br = request.getReader();
        String params = br.readLine();*/

        Brand brand = JSON.parseObject(params, Brand.class);

        brandService.add(brand);

        response.getWriter().write("success");
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.doGet(request, response);
    }
}
