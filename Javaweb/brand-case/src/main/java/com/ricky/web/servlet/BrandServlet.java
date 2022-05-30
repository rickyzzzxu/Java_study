package com.ricky.web.servlet;

import com.alibaba.fastjson.JSON;
import com.ricky.pojo.Brand;
import com.ricky.service.BrandService;
import com.ricky.service.impl.BrandServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet("/brand/*")
public class BrandServlet extends BaseServlet {

    private BrandService brandService = new BrandServiceImpl();


    public void selectAll(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        List<Brand> brands = brandService.selectAll();
        String string = JSON.toJSONString(brands);

        response.setContentType("text/json;charset=utf-8");
        response.getWriter().write(string);
    }

    public void add(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        String params = request.getReader().readLine();

        /*BufferedReader br = request.getReader();
        String params = br.readLine();*/

        Brand brand = JSON.parseObject(params, Brand.class);

        brandService.add(brand);

        response.getWriter().write("success");
    }
}
