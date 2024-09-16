package com.phucdx.app.service;

import com.phucdx.app.model.Laptop;
import org.springframework.stereotype.Service;

@Service
public class LaptopService {
    public void addLaptop(Laptop laptop) {
        System.out.println("Add laptop...");
    }

    public boolean isGoodForProg(Laptop laptop) {
        return true;
    }
}
