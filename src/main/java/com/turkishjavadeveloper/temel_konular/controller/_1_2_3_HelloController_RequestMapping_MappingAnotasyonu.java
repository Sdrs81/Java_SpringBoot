package com.turkishjavadeveloper.temel_konular.controller;

import org.springframework.web.bind.annotation.*;

// localhost:8080/api/hello  // tarayıcıda bu şekilde yazıyoruz (sadece get işlemleri tarayıcıda çalışır.)

@RestController
//@RequestMapping(path = "/api")  class seviyesinde kullanırsak, yeni / kısmı açarız
public class _1_2_3_HelloController_RequestMapping_MappingAnotasyonu {


    //@GetMapping(path = "/hello")  //Veri görüntülemek için kullanıyoruz
    @RequestMapping(path = "/hello", method = RequestMethod.GET)  // yukarıdaki ile aynı, metot seviyesinde tür belirtiyor
    public String sayHello(){
        return "Hello World";
    }

    @PostMapping(path = "/save")   // Veri kaydetmek istediğimiz zaman kullanırız
    public String save(){
        return "Data Saved";
    }

    @DeleteMapping("/delete")    // veri silmek istediğimiz zaman kullanırız, path belirtmeden de yazılabilir
    public String delete(){
        return "Deleted";
    }

    //@PutMapping    // veri güncellemek için kullanırız
    //@PatchMapping     // Verinin bir bölümünü güncellemek için kullanırız


}
