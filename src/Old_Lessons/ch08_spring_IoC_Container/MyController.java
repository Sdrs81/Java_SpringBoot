package com.turkishjavadeveloper.ch08_spring_IoC_Container;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/*
*
*   ApplicationContext
*
    ApplicationContext interface'i f Spring IoC Container'ı temsil eder.
    ApplicationContext, nesnelerin(bean) oluşturulması, konfigüre edilmesi
    ve noktalara bu nesneleri atamakla(Injection) sorumludur.
    Yani ApplicationContext'in ana görevi nesnelerimizin(bean) yönetimini
    sağlamaktır.
*
* */

@RestController
@RequestMapping("/api")
public class MyController {

    @Autowired
    private ApplicationContext applicationContext;

    @GetMapping("/application-context")
    public void examples(){
//        String[] beanDefinitionNames = applicationContext.getBeanDefinitionNames();
//
//        for (String beanDefinitionName : beanDefinitionNames) {
//            System.out.println(beanDefinitionName);
//        }

//        int beanDefinitionCount = applicationContext.getBeanDefinitionCount();
//        System.out.println(beanDefinitionCount);

//        MyComponent myComponent = (MyComponent) applicationContext.getBean("myComponent");
//        System.out.println(myComponent.getName());

//        MyComponent myComponent = (MyComponent) applicationContext.getBean(MyComponent.class);
//        System.out.println(myComponent.getName());

//        Class<?> myComponentClass = applicationContext.getType("myComponent");
//        System.out.println(myComponentClass);  // .getSimpleName() şeklinde myComponentClass özelliği sayesinde direk adını gösterir

        boolean myComponent = applicationContext.containsBean("myComponent");
        System.out.println(myComponent);
    }
}


