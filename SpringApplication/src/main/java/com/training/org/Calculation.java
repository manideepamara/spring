package com.training.org;

import java.util.Map;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Calculation {
	@Autowired
	private Environment environmant;
	
	
	@Value("${mani.init.number}")
	private int number;
	
	@Value("${mani.init.numbers}")
	private int [] numbers;
	
	
	@Value("#{${mani.init.numbers-map}}")
	private Map<String,Integer>  map;

	
	
	@RequestMapping("/test")
	public String hello() {
		System.out.println(environmant.getProperty("spring.application.name"));
		return "hello"+map ;
		
	}
}
