package com.skiitschool.controller;

import com.skiitschool.dto.ProductRequestDTO;
import com.skiitschool.dto.ProductResponseDTO;
import com.skiitschool.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/product")
public class ProductController {
    @Autowired
    ProductService productService;

    @PostMapping
    public ResponseEntity<ProductResponseDTO> createProduct(@RequestBody ProductRequestDTO productRequestDTO){
        ProductResponseDTO product = productService.createProduct(productRequestDTO);
        return new ResponseEntity<>(product, HttpStatus.CREATED);


    }

}
