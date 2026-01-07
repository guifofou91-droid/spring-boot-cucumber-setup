package com.lovedev.cucumber.controller;

import com.lovedev.cucumber.config.exception.ResourceNotFoundException;
import com.lovedev.cucumber.model.Employer;
import com.lovedev.cucumber.service.EmployerService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/employes")
@RequiredArgsConstructor
public class EmployerController {

    private final EmployerService service;

    @PostMapping
    public Employer saveEmployer(@RequestBody Employer employer){
        return service.saveEmployer(employer);
    }

    @GetMapping("/{id}")
    public Employer getEmployerById(@PathVariable int id) {
        return service.getEmployerById(id);
    }

    @GetMapping
    public List<Employer> getAllEmployers() {
        return service.getAllEmployers();
    }
}
