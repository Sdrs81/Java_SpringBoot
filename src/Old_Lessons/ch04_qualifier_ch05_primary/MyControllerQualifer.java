package com.turkishjavadeveloper.ch04_qualifier_ch05_primary;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class MyControllerQualifer {

    @Autowired
    //@Qualifier("WORD")
    private Reader reader;

    @Autowired
    @Qualifier("excelFileReader")  // bu sayaede farklı read nesnelerine birine primary diğerine Qualifer ile atama yapmış olduk
    private Reader reader2;

    @GetMapping("/read")
    public String read(){
        return this.reader.readFile() + " - " + this.reader2.readFile();
    }

}
