package com.turkishjavadeveloper.ch08_spring_IoC_Container;

import org.springframework.stereotype.Component;

@Component
public class MyComponent {

    public String getName(){
        return "My name is MyComponent";
    }
}
