package com.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

@SpringBootApplication
public class Boot13Mvc1Jsp1Application extends  SpringBootServletInitializer{

	public static void main(String[] args) {
		SpringApplication.run(Boot13Mvc1Jsp1Application.class, args);
	}
	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
	// TODO Auto-generated method stub
	return builder.sources(Boot13Mvc1Jsp1Application.class);
	}
}
