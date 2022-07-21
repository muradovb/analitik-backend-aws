package com.example.demo.controller;


import com.example.demo.dto.UploadProductRequest;
import com.example.demo.model.Product;
import com.example.demo.service.ProductService;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/products")
@AllArgsConstructor
public class ProductController {

    private ProductService productService;

    @GetMapping("/healthcheck")
    public ResponseEntity<?> healthCheck() {
        return ResponseEntity.ok("*** health check okay ***");
    }

    @PostMapping("/productUpload")
    public void uploadProduct(@RequestBody UploadProductRequest uploadProductRequest) {
        productService.addProduct(uploadProductRequest);
    }

    @GetMapping("/productsRetrieveAll")
    public List<Product> getListOfProducts()  {
        return productService.getAllProducts();
    }

    //@PutMapping("/productUpdate")
    //public UUID productUpdate(@RequestBody Product product) {
    //    return productService.updateProduct(product);
    //}

}
