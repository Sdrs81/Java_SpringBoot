package com.turkishjavadeveloper;

import com.turkishjavadeveloper.ch03_component_bean.SecondClass;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

// Asıl çalışan program kısmı burası

@SpringBootApplication
public class Lesson1Application {

	public static void main(String[] args) {
		SpringApplication.run(Lesson1Application.class, args);
	}

	/*
	//ch03
	@Bean
	public SecondClass getSecondClass(){
		return new SecondClass();
	}*/

}
