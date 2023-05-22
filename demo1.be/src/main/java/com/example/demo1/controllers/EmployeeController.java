package com.example.demo1.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/employee")
public class EmployeeController {

    @GetMapping
    public String get() { return "get employee method"; }

    @GetMapping
    public String post() { return "post employee method"; }

    @GetMapping
    public String put() { return "put employee method"; }

    @GetMapping
    public String delete() { return "delete employee method"; }
}
