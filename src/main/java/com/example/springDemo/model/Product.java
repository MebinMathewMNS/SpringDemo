package com.example.springDemo.model;

import lombok.Data;

@Data
public class Product {

    Long id;
    String productName;
    int price;
    String model;
}
