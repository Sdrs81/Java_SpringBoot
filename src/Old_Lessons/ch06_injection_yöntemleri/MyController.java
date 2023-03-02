package com.turkishjavadeveloper.ch06_injection_yöntemleri;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class MyController {

    @Autowired
    private FirstClass firstClass; // Field injection
    // Object Oriented'a uymadığı için önerlen bir yöntem değil

    private SecondClass secondClass; // Setter injection
    @Autowired
    public void setSecondClass(SecondClass secondClass) {
        this.secondClass = secondClass;
    }

    private ThirdClass thirdClass;  // Constructor injection

    public MyController(ThirdClass thirdClass) {
        this.thirdClass = thirdClass;
    }
    // En çok bu tavsiye edilir, diğerlerinde hata riski var
    // Eğer birden fazla constructor olursa, varsyılan olarak atama yapmak istediğimizin üzerine @Autowired yazmamız gerekli
    // Constructor içine varsayılan @Qualifer kullanımı da yapılabilir //   MyController(@Qualifer("thirdClass") ThirdClass thirdClass)

    @GetMapping("/names")
    public String getNameOfClasses(){
        return this.firstClass.getName() + " - " + this.secondClass.getName() + " - " + this.thirdClass.getName();
    }


}
