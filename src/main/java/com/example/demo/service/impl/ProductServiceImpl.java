package com.example.demo.service.impl;


import com.example.demo.dao.ProductDao;
import com.example.demo.model.Product;
import com.example.demo.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ProductServiceImpl implements ProductService {

@Autowired
   private ProductDao prodctDao;

    @Override
    public Product getProductById(Integer productId) {
        return prodctDao.getProductById(productId);
    }
}
