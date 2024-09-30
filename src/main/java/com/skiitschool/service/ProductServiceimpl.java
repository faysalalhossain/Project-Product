package com.skiitschool.service;

import com.skiitschool.dto.ProductRequestDTO;
import com.skiitschool.dto.ProductResponseDTO;
import com.skiitschool.entity.Product;
import com.skiitschool.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class ProductServiceimpl implements ProductService {
    @Autowired
    private ProductRepository productRepository;
    @Override
    public ProductResponseDTO createProduct(ProductRequestDTO productRequestDTO) {
          Product product= mapToEntity(productRequestDTO);
           Product newProduct= productRepository.save(product);
           return mapToResponseDTO(newProduct);
    }
    private ProductResponseDTO mapToResponseDTO(Product product){
        return new ProductResponseDTO(
                product.getName(),
                product.getPrice(),
                product.getDescription());

    }
private Product mapToEntity(ProductRequestDTO productRequestDTO){
    Product product =new Product();
    product.setName(productRequestDTO.getName());
    product.setDescription(productRequestDTO.getDescription());
    product.setPrice(productRequestDTO.getPrice());
    return product;
}
    @Override
    public List<ProductResponseDTO> getAllProduct() {
        return List.of();
    }

    @Override
    public ProductResponseDTO getProductById(Long id) {
        return null;
    }

    @Override
    public ProductResponseDTO updateProduct(Long id, ProductRequestDTO productRequestDTO) {
        return null;
    }

    @Override
    public void deleteProduct(Long id) {

    }
}
