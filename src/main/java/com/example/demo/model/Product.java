package com.example.demo.model;

import lombok.*;

import java.util.UUID;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Product {
    private UUID productId;
    private String productName;
    private String productDescription;
    private Double productPrice;

}
