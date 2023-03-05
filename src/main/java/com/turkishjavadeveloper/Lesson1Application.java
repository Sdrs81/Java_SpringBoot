package com.turkishjavadeveloper;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

// Asıl çalışan program kısmı burası

@SpringBootApplication

//@ComponentScan(basePackages = "branch")  //ch10_1
//@ComponentScan(basePackages = {"branch", "com.turkishjavadeveloper"})  //ch10_1
//@ComponentScan(basePackageClasses = MyComponent.class)  //ch10_1 , yukarıdaki gibi {} arasında birden çok verilebilir

//@ComponentScan(useDefaultFilters = false)  //ch10_2
//@ComponentScan(useDefaultFilters = false, basePackages = "com.turkishjavadeveloper.branch")   //ch10_5
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

	/*
	//ch10_1
	@Autowired
	private MyComponent myComponent;

	@Autowired
	private MyService myService;
	*/

	/*
	//ch10_2
	@Autowired
	private MyService myService;
	*/
}
