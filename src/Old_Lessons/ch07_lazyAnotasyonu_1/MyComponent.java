package com.turkishjavadeveloper.ch07_lazyAnotasyonu_1;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Component  // Sadece bu olursa direk nesne oluşur ve container a ekleneir
@Lazy  // Proje çalıştığında direk nesne oluşturmaz, bu sınıfın nesnenise ihtiyaç duyulursa başka bir snıftan vs. o zaman oluşturulur
public class MyComponent {

    public MyComponent() {
        System.out.println("MyComponent bean initalized!");   // Spring Ioc container içine eklenen nesnelere bean denir
    }
}

