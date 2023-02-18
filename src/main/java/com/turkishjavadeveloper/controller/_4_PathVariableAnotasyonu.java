package com.turkishjavadeveloper.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
//@RequestMapping(path = "/api")
public class _4_PathVariableAnotasyonu {

    // Girilen veriyi göstermek için kullanıyoruz

    @GetMapping(path = "/message/{m}")    // süslü parantez içine direk değişkenin ismini yazsaydık aşağıdaki m parantezine ihtiyaç kalmazdı
    public String getMyMessage(@PathVariable("m") String message){
        return "Your message is: " + message;
    }
}
