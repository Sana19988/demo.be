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
public class AuthenticationResponseModel {

    private String email;
    private String firstName;
    private String lastName;
    private RoleEnum role;
    private String accessToken;
    private String refreshToken;
}
