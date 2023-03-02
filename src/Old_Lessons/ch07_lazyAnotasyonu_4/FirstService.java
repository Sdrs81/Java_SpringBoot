package com.turkishjavadeveloper.ch07_lazyAnotasyonu_4;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Service;

@Service
public class FirstService {

    private SecondService secondService;   // Başlangıçta içinde null değer olur, aşağıda lazy olduğu için

    public FirstService(@Lazy SecondService secondService) {  // Bu şekilde birbirinin nesnesine ihtiyaç duyulan durumlardaki hata çözülür
        this.secondService = secondService;
    }
}
