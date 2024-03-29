package com.example.demo1.controllers;

import com.example.demo1.models.UserModel;
import com.example.demo1.services.IUserService;
import jakarta.validation.Valid;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("user")
public class UserController {

    private IUserService iUserService;

    @GetMapping("home")
    public String Home() {
        return "Home page";
    }

    @GetMapping("get")
    public List<UserModel> GetAll() {
        return iUserService.GetAll();
    }

    @PostMapping("create")
    public ResponseEntity<?> Create(@RequestBody @Valid UserModel model, BindingResult result) {

        if (result.hasErrors()) {
            return new ResponseEntity<>(result.getAllErrors().toString(), HttpStatus.BAD_REQUEST);
        }

        return new ResponseEntity<>(iUserService.Create(model), HttpStatus.OK);
    }
}
