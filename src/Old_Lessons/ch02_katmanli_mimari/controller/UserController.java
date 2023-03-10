package com.turkishjavadeveloper.ch02_katmanli_mimari.controller;

import com.turkishjavadeveloper.ch02_katmanli_mimari.dto.User;
import com.turkishjavadeveloper.ch02_katmanli_mimari.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/api")
public class UserController {


    @Autowired
    private UserService userService;

    @GetMapping(path = "/users/{userId}")
    public User getUserById(@PathVariable("userId") Long userId){
        return userService.getUserById(userId);
    }
}
