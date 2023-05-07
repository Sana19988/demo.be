package com.example.demo1.repositories;

import com.example.demo1.models.UserModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IUserRepository extends JpaRepository<UserModel, Integer> {
}
