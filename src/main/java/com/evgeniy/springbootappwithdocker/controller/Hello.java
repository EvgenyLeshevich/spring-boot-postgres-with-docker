package com.evgeniy.springbootappwithdocker.controller;

import com.evgeniy.springbootappwithdocker.entity.User;
import com.evgeniy.springbootappwithdocker.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Hello {

    @Autowired
    private UserRepository userRepository;

    @GetMapping
    public String hello(){
        User user = User.builder()
                .name("Evgeniy")
                .surname("L")
                .build();
        userRepository.save(user);
        return "Hello Docker!";
    }

}
