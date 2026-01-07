package com.lovedev.cucumber.service;

import com.lovedev.cucumber.model.Employer;
import com.lovedev.cucumber.repository.EmployerRepository;

import java.util.List;

public interface EmployerService {
    public Employer saveEmployer(Employer employer);
    public List<Employer> getAllEmployers();
    public Employer getEmployerById(int id);
}
