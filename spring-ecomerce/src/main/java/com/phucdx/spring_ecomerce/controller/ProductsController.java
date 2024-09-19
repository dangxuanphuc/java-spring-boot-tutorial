package com.phucdx.spring_ecomerce.controller;

import com.phucdx.spring_ecomerce.model.Product;
import com.phucdx.spring_ecomerce.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
@CrossOrigin
public class ProductsController {
    @Autowired
    private ProductService service;

    @GetMapping("/products")
    public ResponseEntity<List<Product>> getProducts() {
        return new ResponseEntity<>(service.getAllProducts(), HttpStatus.OK);
    }

    @GetMapping("/product/{id}")
    public ResponseEntity<Product> getProduct(@PathVariable("id") int id) {
        Product product = service.getProductById(id);
        return product.getId() > 0 ? new ResponseEntity<>(product, HttpStatus.OK) : new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }
}
