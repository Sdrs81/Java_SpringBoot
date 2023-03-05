package com.turkishjavadeveloper.ch10_componentScan_5;

import org.springframework.stereotype.Component;

@Component
public class MyComponent {

    public MyComponent() {
        System.out.println("MyComponent created");
    }
}
