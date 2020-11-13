package com.training.org;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.ResultSetExtractor;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {
	@Autowired
	private JdbcTemplate jdbcTemplate;
	@RequestMapping("/insert")
	public String insert() {
		System.out.println("Inserting data");
		jdbcTemplate.execute("insert into student values (101,'mani',23)");
		
		
		
		return "Data Inserted";
		
	}
	
	
	@RequestMapping("/getAllStudents")
	public List<Student> getAllStudents(){
		return jdbcTemplate.query("select * from student",  new StudentRowMapper());
		
		
	}
}

