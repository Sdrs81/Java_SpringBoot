package com.turkishjavadeveloper.temel_konular.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
//@RequestMapping(path = "/api")
public class _5_RequestParamAnotasyonu {

    // Girilen veriyi göstermek için kullanıyoruz ,PathVaribaleAnotasyonu gibi

    /*
    @GetMapping(path = "/message")
    public String getMyMessage(@RequestParam String message){
        return "Your message is: " + message;
    }*/

    @GetMapping(path = "/message")
    public String getMyMessage(@RequestParam("m") String message){  // bu şekilde kullanılırsa Postman'de param kısmında
        return "Your message is: " + message;                       // key olan yere m yazmalıyız, üstteki gibi kullanımda ise
                                                                    // key yerine message yazmalıyız
    }
}
