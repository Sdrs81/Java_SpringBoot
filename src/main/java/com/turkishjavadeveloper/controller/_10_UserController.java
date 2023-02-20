package com.turkishjavadeveloper.controller;

import com.turkishjavadeveloper.dto._10_User;
import com.turkishjavadeveloper.service._10_UserService;
import com.turkishjavadeveloper.service.impl._10_UserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/api")
public class _10_UserController {


    @Autowired
    private _10_UserService userService;

    @GetMapping(path = "/users/{userId}")
    public _10_User getUserById(@PathVariable("userId") Long userId){
        return userService.getUserById(userId);
    }
}
