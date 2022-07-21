package com.example.demo.service;

import com.example.demo.dto.UploadProductRequest;
import com.example.demo.model.Product;

import java.util.List;
import java.util.UUID;

public interface ProductService {

     UUID addProduct(UploadProductRequest uploadProductRequest);
     List<Product> getAllProducts();
     void updateProduct(Product product);
}
