package com.phucdx.app.repo;

import com.phucdx.app.model.Laptop;
import org.springframework.stereotype.Repository;

@Repository
public class LaptopRepository {
    public void save(Laptop laptop) {
        System.out.println("Saved in Database...");
    }
}
