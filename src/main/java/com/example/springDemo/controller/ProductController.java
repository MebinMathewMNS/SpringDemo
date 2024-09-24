package com.example.springDemo.controller;

import com.example.springDemo.model.Product;
import com.example.springDemo.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ProductController {

    @Autowired
    ProductService productService;

    @GetMapping("/getMessage")
    public String getMessage(){
        return "Welcome to springDemo";
    }

    @GetMapping("/getProduct")
    public List<Product> getProduct(){
        return productService.getAllProduct();
    }

    @PostMapping("/addProduct/{id}")
    public boolean addProduct(@PathVariable Long id, @RequestBody Product product){
        productService.addProduct(id,product);
        return true;
    }

    @PutMapping("/updateProduct/{id}")
    public boolean updateProduct(@PathVariable Long id, @RequestBody Product product){
        productService.updateProduct(id,product);
        return true;
    }

    @DeleteMapping("/deleteProduct/{id}")
    public boolean deleteProduct(@PathVariable Long id){
        productService.deleteProduct(id);
        return true;
    }
}
