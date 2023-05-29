package com.example.demo1.models;

import com.example.demo1.enums.RoleEnum;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class RegisterRequestModel {

    private String firstName;
    private String lastName;
    private String email;
    private String password;
    private RoleEnum role;
}
