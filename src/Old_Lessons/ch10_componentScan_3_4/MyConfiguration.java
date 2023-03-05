package com.turkishjavadeveloper.ch10_componentScan_3_4;

import com.turkishjavadeveloper.ch10_componentScan_3_4.branch.MyClass1;
import com.turkishjavadeveloper.ch10_componentScan_3_4.branch.MyClass2;
import com.turkishjavadeveloper.ch10_componentScan_3_4.branch.MyClass3;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.FilterType;

@Configuration
//@ComponentScan(basePackages = "com.turkishjavadeveloper.branch", includeFilters = @ComponentScan.Filter(type = FilterType.ANNOTATION,
//    classes = TurkishJavaDeveloper.class))

//@ComponentScan(basePackages = "com.turkishjavadeveloper.branch", includeFilters = @ComponentScan.Filter(type = FilterType.ASSIGNABLE_TYPE,
//    classes = MyClass3.class))

//@ComponentScan(basePackages = "com.turkishjavadeveloper.branch",
//        includeFilters = @ComponentScan.Filter(type = FilterType.REGEX,
//    pattern = ".*[12]"))  // sonu 1 veya 2 olan classları component olarak alır

//@ComponentScan(basePackages = "com.turkishjavadeveloper.branch",
//        includeFilters = @ComponentScan.Filter(type = FilterType.ASPECTJ,
//                pattern = "com.turkishjavadeveloper.*"))  // bu paket altındaki tüm sınıfları component olarak alır, * yerine sınıf adı yazrsak sadece onu alır

//@ComponentScan(basePackages = "com.turkishjavadeveloper.branch",
//        includeFilters = @ComponentScan.Filter(type = FilterType.ASPECTJ,
//                pattern = "com.turkishjavadeveloper.*"),
//        excludeFilters = @ComponentScan.Filter(type = FilterType.ASSIGNABLE_TYPE,
//        classes = MyClass2.class))   // burada MyClass2 dışındaki diğer class lar component class olarak alınır

@ComponentScan(basePackages = "com.turkishjavadeveloper.branch",
        useDefaultFilters = false,
        includeFilters = @ComponentScan.Filter(type = FilterType.CUSTOM,
                classes = MyCustomFilter.class))
public class MyConfiguration {

    /* componentScan3
    @Autowired
    private MyClass1 myClass1;  // Annotation type örneği, anotasyon filtrelemesi

    @Autowired
    private MyClass2 myClass2;  // Anootaton type örneği, basepackages (defaultfilters özelliği true)

    @Autowired
    private MyClass3 myClass3 = new MyClass4();   //Assignable type örneği, birbirine atanabilir sınıflar için

    @Autowired
    private MyClass4 myClass4; // Assignable type örneği*/

    // ComponentScan4

    @Autowired
    private MyClass1 myClass1;

    @Autowired
    private MyClass3 myClass3;

    @Autowired
    private MyClass2 myClass2;
}
