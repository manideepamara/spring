

package com.training.org;

import java.util.List;

import javax.sql.DataSource;

import org.springframework.jdbc.core.JdbcTemplate;

public class StudentJDBCTemplate implements StudentDAO{
    private DataSource dataSource;
    private JdbcTemplate jdbcTemplateObject;
    
    public void setDataSource(DataSource dataSource) {
        this.dataSource=dataSource;
        this.jdbcTemplateObject=new JdbcTemplate(dataSource);
    }

    @Override
    public void create(Integer id, String name, Integer age) {
        String query="insert into Student(name,age) values (?,?)";
        jdbcTemplateObject.update(query,name,age);
        System.out.println("Record inserted into student table ");
    }

	@Override
	public List<Student> getStudents() {
		String SQL = "select * from Student";
		List<Student> students = jdbcTemplateObject.query(SQL,new StudentRowMapper());
		System.out.println("list of students are ");
		return students;
	}
    
	
    
    
     
    
    
} 


