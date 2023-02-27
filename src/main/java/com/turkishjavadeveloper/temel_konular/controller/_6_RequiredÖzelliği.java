package com.turkishjavadeveloper.temel_konular.controller;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(path = "/api")
public class _6_RequiredÖzelliği {

    // Bu özelliğin kullanıldığı alanı, zorunlu mu değil mi şeklinde belirtmemizi sağlar
    // Varsayılan olarak true şeklinde ayarlıdır

    // Eğer birden fazla değer giriceksek(PathVariable ya da RequestParam içine) name gibi belirteçler kullanmalıyız,
    // bir tane kullanıcaksak gerek yok

    @GetMapping({"/message1/{message}", "/message1"})  //birden fazla path ekleyeceksek bu şekilde yazmalıyız, veri yollamadan çalıştırırsak hata vericeği için path ekledik
    public String getMyMessageWithVariable(@PathVariable(name = "message", required = false) String message){
        return "Your message is: " + message;
    }

    // Bunda üstteki gibi çalışması için birden fazla path girmemize gerek yok
    // defaultValue ile veri gelmezse varsayılan veriyi ayarlıyoruz
    // RequestParam da messajı URL ye yazarken araya + koyarsak göstermiyor, üsttekinde ise gösteriyor
    @GetMapping("/message2")
    public String getMyMessageWithParam(@RequestParam(name = "message", required = false, defaultValue = "my default") String message){
        return "Your message is: " + message;
    }
}
