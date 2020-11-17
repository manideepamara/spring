package com.training.org;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.ResultSetExtractor;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {
	@Autowired
	private JdbcTemplate jdbcTemplate;
	private Map<String,Object> m;
	@RequestMapping("/insert")
	public String insert() {
		System.out.println("Inserting data");
		jdbcTemplate.execute("insert into student values (101,'mani',23)");
		
		
		
		return "Data Inserted";
		
	}
	
	@PostMapping("/update/{uid}")
	public Map<String,Object>  handleUpdate(@RequestBody Student student,@PathVariable String uid)
	{
		System.out.println(student);
		System.out.println(uid);
		
		Map<String,Object> m = new HashMap<String, Object>();
		m.put("student", student);
		m.put("uid", uid);
		return m;
	}
	@RequestMapping("/getAllStudents")
	public List<Student> getAllStudents(){
		return jdbcTemplate.query("select * from student",  new StudentRowMapper());
		
		
	}
}

