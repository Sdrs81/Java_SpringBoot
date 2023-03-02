package com.turkishjavadeveloper.ch07_lazyAnotasyonu_2;

import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyControlller {

    /*
    private Example1 example1;  // Bean ile de Lazy anotasyonu kullanılabilir, bunu çağırırsak,
    // bunun içinde olduğu sınıfındaki bean de oluşturulur

    public MyControlller(Example1 example1) {
        this.example1 = example1;
    }*/

    /*
    private MyConfiguration myConfiguration; // İç içe Durumunda lazy kullanımı

    public MyControlller(MyConfiguration myConfiguration) {
        this.myConfiguration = myConfiguration;
    }*/
}
