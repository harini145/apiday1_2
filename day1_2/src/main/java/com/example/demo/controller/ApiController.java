package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ApiController {

    @GetMapping("/get")
    public String getName() {
        String studentName = "IamNeo"; 
        return "Welcome " + studentName + "!";
    }
}