package com.orage.user_service.controllers;


import com.orage.user_service.dto.RegisterRequest;
import com.orage.user_service.entities.User;
import com.orage.user_service.repositories.UserRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/register")
public class RegistrationController {

    @Autowired
    private UserRepository userRepository;
    @Autowired
    private PasswordEncoder passwordEncoder;
     @PostMapping
    public ResponseEntity<?> registerUser(@RequestBody RegisterRequest registerRequest){
         passwordEncoder.encode(registerRequest.getPassword());
         User user = User.builder().username(registerRequest.getUsername())
                 .password(passwordEncoder.encode(registerRequest.getPassword()))
                 .roles(registerRequest.getRoles()).build();
         userRepository.save(user);
         return  new ResponseEntity<>("User Registered Successfully", HttpStatus.OK);
     }

}
