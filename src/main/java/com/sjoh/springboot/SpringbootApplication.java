package com.sjoh.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@SpringBootApplication
@RestController
public class SpringbootApplication {

	@RequestMapping("/")
	String hello() {
		return "쭈찌얌!! <b style='color:#F2DCDB;'>사랑해!♡♥</b>";
	}
	
	public static void main(String[] args) {
		SpringApplication.run(SpringbootApplication.class, args);
	}
	
}
