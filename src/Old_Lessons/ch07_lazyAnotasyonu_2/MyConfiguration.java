package com.turkishjavadeveloper.ch07_lazyAnotasyonu_2;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Lazy;

@Configuration
@Lazy //eğer burada yazarsak kendi bean i ile beraber aynı zamanda içindeki @Bean anotasyonları içinde aynı etkiyi yapar
public class MyConfiguration {

    public MyConfiguration() {
        System.out.println("MyConfiguration bean initialized");
    }

    @Bean
    //@Lazy
    public Example1 getExample1(){
        return new Example1();
    }

    @Bean
    //@Lazy
    public Example2 getExample2(){
        return new Example2();
    }
}
