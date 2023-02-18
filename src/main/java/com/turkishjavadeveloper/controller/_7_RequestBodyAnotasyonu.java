package com.turkishjavadeveloper.controller;

import com.turkishjavadeveloper.model.User;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
//@RequestMapping(path = "/api")
public class _7_RequestBodyAnotasyonu {

    // Bu özelliği veri olarak nesne vermek istediğimizde kullanıyoruz
    // Gelen json verisini nesneye dönüştürüyor

    @PostMapping("users")  // / koymasak da çalışır, Spring otomatik ekliyor
    public User saveUser(@RequestBody User user){
        System.out.println("User saved");
        user.setPassword("");
        return user;
    }

    @PostMapping("users-all")  // / koymasak da çalışır, Spring otomatik ekliyor
    public List<User> saveAllUsers(@RequestBody List<User> users){
        System.out.println("All users saved");
        users.forEach(user -> user.setPassword(""));
        return users;
        
    }

}
