package com.phucdx.spring_ecomerce.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class ProductsController {
    @GetMapping("/products")
    public String getProducts() {
        return "All products";
    }
}
