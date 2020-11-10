package com.training.org;

import javax.sql.DataSource;

import org.springframework.jdbc.core.JdbcTemplate;

public class StudentJDBCTemplate implements StudentDAO {
	private DataSource dataSource;
	private JdbcTemplate jdbcTemplateObject;
	@Override
	public void setDataSource(DataSource dataSource ) {
		this.dataSource=dataSource;
		this.jdbcTemplateObject=new JdbcTemplate(dataSource);
	}
	@Override
	public void create(int id, String name, int age) {
		
		String query="insert into student (name,age) values (?,?) ";
		jdbcTemplateObject.update(query,name,age);
		
		
		
	}
	
	
	
	
}
