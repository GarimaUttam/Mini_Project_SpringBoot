package com.example.simpleWebApp.controller;

import com.example.simpleWebApp.model.Product;
import com.example.simpleWebApp.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ProductController {

    @Autowired
    ProductService service;


    // by defaulst these methods are get methods if we want to use other we have to mention it
//    @RequestMapping("/products") this will work same as the get mapping
    @GetMapping("/products")
    public List<Product> getProducts() {
        return service.getProducts();
    }

    @RequestMapping("/products/{prodId}")
    public Product getProductById(@PathVariable int prodId){
        return service.getProductById(prodId);
    }
    // we are adding this product from client to server
    @PostMapping("/products")
    public void addProduct(@RequestBody Product prod){
        service.addProduct(prod);
        System.out.println(prod);
    }
}
