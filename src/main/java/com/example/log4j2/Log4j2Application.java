package com.example.log4j2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;


//để tăng performance lúc start Springboot
//@ComponentScan({"com.in28minutes.springboot.basics.springbootin10steps","com.in28minutes.springboot.somethingelse"})
@SpringBootApplication
@ComponentScan({"com.example.log4j2.*"})
public class Log4j2Application {

	public static void main(String[] args) {
		SpringApplication.run(Log4j2Application.class, args);
	}

}
