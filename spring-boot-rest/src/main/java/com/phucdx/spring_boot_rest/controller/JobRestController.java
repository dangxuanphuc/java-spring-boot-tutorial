package com.phucdx.spring_boot_rest.controller;

import com.phucdx.spring_boot_rest.model.JobPost;
import com.phucdx.spring_boot_rest.service.JobService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "http://localhost:3000")
public class JobRestController {
    @Autowired
    private JobService service;
    @Autowired
    private JobPost jobPost;

    @GetMapping(path="jobPosts", produces = {"application/json"})
    public List<JobPost> getAllJobs() {
        return service.getAllJobs();
    }

    @GetMapping("jobPost/{jobId}")
    public JobPost getJob(@PathVariable("jobId") int jobId) {
        return service.getJob(jobId);
    }

    @PostMapping(path="jobPost", consumes = {"application/xml"})
    public JobPost addJob(@RequestBody JobPost jobPost) {
        service.addJob(jobPost);
        return service.getJob(jobPost.getId());
    }

    @PutMapping("jobPost")
    public JobPost updateJob(@RequestBody JobPost jobPost) {
        service.updateJob(jobPost);
        return service.getJob(jobPost.getId());
    }

    @DeleteMapping("jobPost/{jobId}")
    public String deleteJob(@PathVariable("jobId") int jobId) {
        service.remove(jobId);
        return "Deleted";
    }

    @GetMapping("load")
    public String loadData() {
        service.load();
        return "success";
    }
}
