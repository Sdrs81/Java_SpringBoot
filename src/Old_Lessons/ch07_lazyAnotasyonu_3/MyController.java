package com.turkishjavadeveloper.ch07_lazyAnotasyonu_3;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/api")
public class MyController {

    //Constructor injection yöntemi ile kullanımı
    private MyComponent myComponent;

    public MyController(@Lazy MyComponent myComponent) {   // Bu şekilde kullanmazsak direk bean oluşturulur ve atanır,
        this.myComponent = myComponent;                    // bu şekilde ise oluşturulur fakat atanma (injection) olmaz
    }                                                      // aşağıdaki fonksiyonlarda kullanıldığında injection yapılır
                                                            // Kendi dosyasındaki constructor ise her türlü çalışır
                                                            // konsolda çıktı görülür /*


    /*  field injection yöntemi ile kullanımı
    @Autowired
    @Lazy
    private MyComponent myComponent;
    */


    @GetMapping("/name")
    public String getComponentName(){
        return myComponent.getName();
    }
}
