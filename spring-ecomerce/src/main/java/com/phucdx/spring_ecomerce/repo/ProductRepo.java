package com.phucdx.spring_ecomerce.repo;

import com.phucdx.spring_ecomerce.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductRepo extends JpaRepository<Product, Integer> {
}
