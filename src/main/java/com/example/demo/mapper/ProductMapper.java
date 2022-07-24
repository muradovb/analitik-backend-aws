package com.example.demo.mapper;

import com.example.demo.dto.UploadProductRequest;
import com.example.demo.model.Product;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import java.util.UUID;

@Mapper(componentModel = "spring")
public abstract class ProductMapper {


    @Mapping(source = "productName", target = "productName")
    @Mapping(source = "productDescription", target = "productDescription")
    @Mapping(source = "productPrice", target = "productPrice")
    public abstract Product toProduct(UploadProductRequest uploadProductRequest);

}
