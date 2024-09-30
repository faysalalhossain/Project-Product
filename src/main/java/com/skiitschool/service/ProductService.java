package com.skiitschool.service;

import com.skiitschool.dto.ProductRequestDTO;
import com.skiitschool.dto.ProductResponseDTO;
import com.skiitschool.entity.Product;

import java.util.List;

public interface ProductService {
    ProductResponseDTO createProduct(ProductRequestDTO productRequestDTO);
    List<ProductResponseDTO> getAllProduct();
    ProductResponseDTO getProductById(Long id);
    ProductResponseDTO updateProduct(Long id,ProductRequestDTO productRequestDTO);
    void deleteProduct(Long id);


}
