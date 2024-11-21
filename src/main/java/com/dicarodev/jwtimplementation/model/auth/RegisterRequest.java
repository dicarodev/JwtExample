package com.dicarodev.jwtimplementation.model.auth;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class RegisterRequest {
    private String name;
    private String firstSurname;
    private String secondSurname;
    private String email;
    private String password;
}
