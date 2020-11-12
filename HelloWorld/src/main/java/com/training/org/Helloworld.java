package com.training.org;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages="com.training.component")
public class Helloworld {

	public static void main(String []args) {
		SpringApplication.run(Helloworld.class,args);
		
		
	}
}