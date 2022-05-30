package com.ricky.service;

import com.ricky.pojo.Brand;

import java.util.List;

public interface BrandService {

    List<Brand> selectAll();

    void add(Brand brand);
}
