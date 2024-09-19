package com.phucdx.spring_ecomerce.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    @GetMapping("/hello")
    public String great() {
        return "Welcome to Spring Ecommerce!";
    }
}
