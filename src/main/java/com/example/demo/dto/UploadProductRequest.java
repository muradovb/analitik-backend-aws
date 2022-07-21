package com.example.demo.dto;


import lombok.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class UploadProductRequest {

    private String productName;
    private String productDescription;
    private Double productPrice;

}
