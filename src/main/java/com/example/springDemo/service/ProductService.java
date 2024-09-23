package com.example.springDemo.service;

import com.example.springDemo.model.Product;

import java.util.List;

public interface ProductService {
    List<Product> getAllProduct();
    Boolean addProduct(Long id, Product product);
    Boolean updateProduct(Long id, Product product);
    Boolean deleteProduct(Long id);
}
