package com.phucdx.app.service;

import com.phucdx.app.repo.LaptopRepository;
import com.phucdx.app.model.Laptop;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LaptopService {
    @Autowired
    private LaptopRepository repo;

    public void addLaptop(Laptop laptop) {
        repo.save(laptop);
    }

    public boolean isGoodForProg(Laptop laptop) {
        return true;
    }
}
