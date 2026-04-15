package com.coderz.springsecurity.controller;

import com.coderz.springsecurity.entity.AuthRequest;
import com.coderz.springsecurity.service.AuthService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
public class AuthController {

    @Autowired
    private AuthService authService;

    @Autowired
    private AuthenticationManager authenticationManager;

    @GetMapping("/home")
    public String homePage(){
        return "Welcome to Cod;tas";
    }

    @PostMapping("/login")
    public String loginUser(@RequestBody AuthRequest authRequest){
        return authService.loginUser(authRequest);
    }
}
