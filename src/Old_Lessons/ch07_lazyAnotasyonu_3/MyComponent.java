package com.turkishjavadeveloper.ch07_lazyAnotasyonu_3;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Component
@Lazy // eğer bunu kullanırsak, Controller sınıfında da constructor içinde de
    // kulladığımız için konsolda çıktı vermez (constructor çalışmaz). Kullanmazsak Controller sınıfındaki senaryo geçerli
public class MyComponent {

    public MyComponent() {
        System.out.println("MyComponent bean initialized");
    }

    public String getName(){
        return "MyComponent";
    }
}
