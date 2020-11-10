package com.training.org;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class MyController {

	@RequestMapping(value="/hello",method=RequestMethod.GET)
	public String helloMessage(ModelMap model) {
		model.addAttribute("message","hello manideep how are yoy?");
		return "hello";
	}
	
	
	
	@RequestMapping(value="/addStudent",method=RequestMethod.POST)
	public String addStudent(@ModelAttribute("SpringWeb") Student student,ModelMap model) {
	
		
			int id = student.getId();
			String name = student.getName();
			int age = student.getAge();
			
			
			 ApplicationContext context=new ClassPathXmlApplicationContext("ApplicationContext.xml");
		     StudentJDBCTemplate studentJDBCTemplate=(StudentJDBCTemplate)context.getBean("studentJDBCTemplate");
//		 ApplicationContext context=new ClassPathXmlApplicationContext("ApplicationContext.xml");
//	     StudentJDBCTemplate studentJDBCTemplate = (StudentJDBCTemplate)context.getBean("studentJDBCTemplate");
		 studentJDBCTemplate.create(id, name, age);
		 model.addAttribute("id", id);
		 model.addAttribute("name",name);
		 model.addAttribute("age",age);
		return "result";
	}
	
	
	
}

