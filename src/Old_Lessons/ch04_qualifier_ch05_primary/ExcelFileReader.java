package com.turkishjavadeveloper.ch04_qualifier_ch05_primary;

import org.springframework.stereotype.Component;

@Component
public class ExcelFileReader implements Reader{
    @Override
    public String readFile() {
        return "Excel File";
    }
}
