package com.fstop.test;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


//import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
//import org.springframework.boot.builder.SpringApplicationBuilder;

@SpringBootApplication
//public class crud extends SpringBootServletInitializer {
public class crud {
	
//	@Override
//	protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
//		return builder.sources(crud.class);
//	}
	
	public static void main(String[] args) {
		SpringApplication.run(crud.class, args);
	}
}
