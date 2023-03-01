package com.turkishjavadeveloper;

import com.turkishjavadeveloper.ch04_qualifier_ch05_primary.WordFileReader;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Primary;

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
