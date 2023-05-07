package com.example.demo1.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("user")
public class UserController {

    @GetMapping("home")
    public String Home() {
        return "Home page";
    }

    @GetMapping("get")
    public List<String> GetAll() {
        return List.of("Petar", "Nikola", "Boris");
    }

}
