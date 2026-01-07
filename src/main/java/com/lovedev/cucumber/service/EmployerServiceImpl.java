package com.lovedev.cucumber.service;

import com.lovedev.cucumber.model.Employer;
import com.lovedev.cucumber.repository.EmployerRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class EmployerServiceImpl implements EmployerService {

    private final EmployerRepository repository;
    @Override
    public Employer save(Employer employer) {
        return repository.save(employer);
    }

    @Override
    public Employer getById(int id) {
        return repository.findById(id).orElseThrow(

        );
    }

    @Override
    public List<Employer> getAll() {
        return repository.findAll();
    }
}
