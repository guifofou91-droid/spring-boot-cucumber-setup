package com.lovedev.cucumber.service;

import com.lovedev.cucumber.model.Employer;

import java.util.List;

public interface EmployerService {

    public Employer save(Employer employer);

    public Employer getById(int id);

    public List<Employer> getAll();
}
