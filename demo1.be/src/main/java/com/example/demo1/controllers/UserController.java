package com.example.demo1.controllers;

import com.example.demo1.models.UserModel;
import com.example.demo1.services.IUserService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("user")
public class UserController {

    private IUserService iUserService;

    public UserController(IUserService iUserService) {
        this.iUserService = iUserService;
    }

    @GetMapping("home")
    public String Home() {
        return "Home page";
    }

    @GetMapping("get")
    public List<UserModel> GetAll() {
        return iUserService.GetAll();
    }

    @PostMapping("create")
    public UserModel Create(String firstName, String lastName, String email) {

        UserModel model = new UserModel();
        model.setFirstName(firstName);
        model.setLastName(lastName);
        model.setEmail(email);
        return iUserService.Create(model);
    }
}
