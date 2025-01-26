package com.example.simpleWebApp.service;

import com.example.simpleWebApp.model.Product;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;

@Service
public class ProductService {

    List<Product> products = Arrays.asList(
            new Product(101,"iphone", 433242),
            new Product(102, "macBook", 342343),
            new Product(103, "Apple Desktop", 324213));



    public List<Product> getProducts(){
        return products;
    }
}
