package com.phucdx.spring_ecomerce.service;

import com.phucdx.spring_ecomerce.model.Product;
import com.phucdx.spring_ecomerce.repo.ProductRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {
    @Autowired
    private ProductRepo repo;

    public List<Product> getAllProducts() {
        return repo.findAll();
    }
}
