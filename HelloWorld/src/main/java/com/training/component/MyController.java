package com.training.component;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
@RestController
public class MyController {

		
		@RequestMapping("/hello")
		public String getmessage() {
			return "Hello manideep from Spring Boot Application";
		}
		
		
		@RequestMapping("/emp")
		public List<Employee> getEmp(@RequestParam(value="name" ) String name,@RequestParam(value="name2",defaultValue="DBS") String mani){
			System.out.println(name+" "+mani);
			List<Employee> emps = new ArrayList<Employee>();
			
			emps.add(new Employee(1,"mani",21,"15/08/1999"));
			
			return emps;
			
		}
		@RequestMapping("/getCustomer")
		public List<Customer> getCustomer(@RequestParam(value="id",defaultValue="null") String id){
			
			
			List<Customer> cus = new ArrayList<Customer>();
			cus.add(new Customer(101,"mani","hyd"));
			cus.add(new Customer(102,"mani","hyd"));
			cus.add(new Customer(103,"mani","hyd"));
			
			if(id.equalsIgnoreCase("null")) {
				return cus;
			}
			
			List<Customer> res = new ArrayList<Customer>();
			for(Customer cust:cus) {
				if((cust.getId())==Integer.parseInt(id)) {
					res.add(cust);
				}
			}
			return res;
		}
}
