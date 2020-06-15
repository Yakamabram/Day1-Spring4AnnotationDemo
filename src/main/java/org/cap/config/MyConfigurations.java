package org.cap.config;

import org.cap.model.Department;
import org.cap.model.Employee;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class MyConfigurations {

	@Bean(name="employee")
	public Employee getEmployee(){
		//Department department=new Department(1, "Sales");
		return new Employee(1001, "Tom", "Jerry", 12000);
	}
	
	
	@Bean(name="employee1")
	@Scope("prototype")
	public Employee getEmployeeObject(){
		return new Employee(1003, "Jack", "Emi", 34000);
	}
	
	@Bean(name="department1")
	public Department getDepartment(){
		return new Department(12, "Purchase");
	}
	
	@Bean(name="depart")
	public Department getDepartmentObject(){
		return new Department(13, "HR");
	}
	
	@Bean(name="depart1")
	public Department getDepartmentObject1(){
		return new Department(15, "Sales");
	}
	
	
}
