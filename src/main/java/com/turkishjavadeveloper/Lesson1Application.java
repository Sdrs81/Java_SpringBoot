package com.turkishjavadeveloper;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

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


	/*
	//ch04
	@Bean//("WORD")
	@Primary  // burada da kullanabiliyoruz
	public WordFileReader getWordFileReader(){
		return new WordFileReader();
	}*/

}
