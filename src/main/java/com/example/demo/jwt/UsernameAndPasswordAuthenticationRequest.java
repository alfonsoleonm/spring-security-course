package com.example.demo.jwt;

import lombok.Getter;
import lombok.Setter;

public class UsernameAndPasswordAuthenticationRequest {
    @Getter @Setter
    private String username;
    @Getter @Setter
    private String password;


}
