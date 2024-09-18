package com.phucdx.spring_boot_rest.service;

import com.phucdx.spring_boot_rest.model.JobPost;
import com.phucdx.spring_boot_rest.repo.JobRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class JobService {
    @Autowired
    private JobRepo repo;

    public void addJob(JobPost job) {
        repo.addJob(job);
    }

    public List<JobPost> getAllJobs() {
        return repo.getAllJobs();
    }
}
