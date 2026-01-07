package com.lovedev.cucumber.service;

import com.lovedev.cucumber.config.exception.ResourceNotFoundException;
import com.lovedev.cucumber.model.Employer;
import com.lovedev.cucumber.repository.EmployerRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class EmployerServiceImplement implements EmployerService{

    private EmployerRepository repository;


    @Override
    public Employer saveEmployer(Employer employer) {
        return repository.save(employer);
    }

    @Override
    public List<Employer> getAllEmployers() {
        return repository.findAll();
    }

    @Override
    public Employer getEmployerById(int id) {
        return repository.findById((long)id)
                .orElseThrow(
                        () -> new ResourceNotFoundException("No resources found with ID : " + id));
    }
}
