package com.example.demo1.services;

import com.example.demo1.models.UserModel;
import org.apache.catalina.User;

import java.util.List;

public interface IUserService {
    List<UserModel> GetAll();
    UserModel Create(UserModel model);
}
