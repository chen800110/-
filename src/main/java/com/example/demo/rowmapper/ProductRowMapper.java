package com.example.demo.rowmapper;

import com.example.demo.model.Product;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class ProductRowMapper implements RowMapper<Product> {
    @Override
    public Product mapRow(ResultSet resultSet, int i) throws SQLException {
        Product product = new Product();
        product.setProductId(resultSet.getInt("product_id"));
        product.setProductName(resultSet.getString("product_name"));
        product.setCategory(resultSet.getString("category"));
        product.setImage_url(resultSet.getString("image_url"));
        product.setPrice(resultSet.getInt("price"));
        product.setDescription(resultSet.getString("description"));
        product.setCreateddate(resultSet.getTimestamp("createddate"));
        product.setLastmodifieddate(resultSet.getTimestamp("lastmodifieddate"));
        return product;



    }
}
