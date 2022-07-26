package com.example.demo.service.impl;


import com.example.demo.dto.UploadProductRequest;
import com.example.demo.mapper.ProductMapper;
import com.example.demo.model.Product;
import com.example.demo.repository.ProductRepository;
import com.example.demo.service.ProductService;
import lombok.AllArgsConstructor;
import org.mapstruct.factory.Mappers;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.UUID;

@Service
public class ProductServiceImpl implements ProductService {

    private final ProductMapper productMapper = Mappers.getMapper(ProductMapper.class);
    private final ProductRepository productRepository;

    public ProductServiceImpl(ProductRepository pr) {
        this.productRepository=pr;
    }
    @Override
    @Transactional
    public UUID addProduct(UploadProductRequest uploadProductRequest) {
        Product newProduct = productMapper.toProduct(uploadProductRequest);
        UUID newProductId = UUID.randomUUID();
        newProduct.setProductId(newProductId);
        productRepository.insertProduct(newProduct);
        return newProductId;
    }

    @Override
    public List<Product> getAllProducts() {
        return productRepository.getAllProducts();
    }

    @Override
    public void updateProduct(Product product) {
        // return productRepository.;
    }


}
