package com.training.org;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyMain {
    public static void main(String[] args) {
        ApplicationContext context=new ClassPathXmlApplicationContext("AppliationContext.xml");
        StudentJDBCTemplate studentJDBCTemplate=(StudentJDBCTemplate)context.getBean("studentJDBCTemplate");
//        System.out.println("--CREATE RECORD----");
//        studentJDBCTemplate.create(101, "Eshan", 23);
        List<Student> students = studentJDBCTemplate.getStudents();
        for(Student student:students) {
        	System.out.println(student);
     
        }
    }

}
