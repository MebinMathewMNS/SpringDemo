package com.example.springDemo.service;

import com.example.springDemo.model.Product;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class ProductServiceImpl implements ProductService{

    Map<Long,Product> productMap = new HashMap<>();
    @Override
    public List<Product> getAllProduct() {
        return new ArrayList<>(productMap.values());
    }

    @Override
    public Boolean addProduct(Long id,Product product) {
        productMap.put(id, product);
        return true;
    }

    @Override
    public Boolean updateProduct(Long id, Product product) {
        productMap.put(id, product);
        return true;
    }

    @Override
    public Boolean deleteProduct(Long id) {
        productMap.remove(id);
        return true;
    }
}
