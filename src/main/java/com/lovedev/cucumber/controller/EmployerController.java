package com.lovedev.cucumber.controller;

import com.lovedev.cucumber.model.Employer;
import com.lovedev.cucumber.service.EmployerService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/v1/employers")
public class EmployerController {

    private final EmployerService service;

    @GetMapping("/{id}")
    public Employer getEmployerById(@PathVariable int id){
        return service.getById(id);
    }

    @PostMapping
    public Employer saveEmployer(@RequestBody Employer employer){
        return service.save(employer);
    }

    @GetMapping
    public List<Employer> getEmployers(){
        return service.getAll();
    }
}
