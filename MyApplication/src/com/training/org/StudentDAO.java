package com.training.org;

import javax.sql.DataSource;

public interface StudentDAO {
	public  void setDataSource(DataSource datasource);
	
	public void create(int id,String name,int age);

}
