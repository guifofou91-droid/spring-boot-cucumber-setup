package com.lovedev.cucumber.controller;

import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmployerController {

    public String getEmployer(){
        return "John";
    }
}
