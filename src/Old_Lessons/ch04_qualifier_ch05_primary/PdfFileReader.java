package com.turkishjavadeveloper.ch04_qualifier_ch05_primary;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component("PDF")
//@Primary  //Qualifer anotasyonu yerine bunu da kullanabiliriz, bunu kullanırsak varsayılan olarak bu atanır
public class PdfFileReader implements Reader{
    @Override
    public String readFile() {
        return "Pdf File";
    }
}
