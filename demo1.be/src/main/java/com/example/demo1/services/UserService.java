package com.example.demo1.services;

import com.example.demo1.models.UserModel;
import com.example.demo1.repositories.IUserRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service()
public class UserService implements IUserService {
    private IUserRepository iUserRepository;

    public UserService(IUserRepository iUserRepository) {
        this.iUserRepository = iUserRepository;
    }

    @Override
    public List<UserModel> GetAll() {
        return iUserRepository.findAll();
    }

    @Override
    public UserModel Create(UserModel model) {
        return iUserRepository.save(model);
    }
}
