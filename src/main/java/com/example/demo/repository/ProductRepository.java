package com.example.demo.repository;

import com.example.demo.model.Product;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface ProductRepository {

    @Insert("INSERT INTO products VALUES #{product.id}, #{product.name}," +
            " #{product.description}, #{product.price}")
    void insertProduct(Product product);

    @Select("SELECT * FROM products")
    List<Product> getAllProducts();

}
