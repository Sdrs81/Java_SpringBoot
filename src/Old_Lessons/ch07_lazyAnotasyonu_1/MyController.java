package com.turkishjavadeveloper.ch07_lazyAnotasyonu_1;

import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {

    private MyComponent myComponent;  // Burada gerektiği için nesne oluşturuldu

    public MyController(MyComponent myComponent) {
        this.myComponent = myComponent;
    }
}
