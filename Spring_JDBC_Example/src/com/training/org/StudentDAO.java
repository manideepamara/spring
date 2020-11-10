package com.training.org;

import javax.sql.DataSource;
import java.util.List;
public interface StudentDAO {

    public void setDataSource(DataSource ds);
    public void create(Integer id,String name,Integer age);
    public List<Student> getStudents();
}