package org.cap.boot;

import org.cap.config.MyConfigurations;
import org.cap.model.Employee;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class TestClass {

	public static void main(String[] args) {
		
		AnnotationConfigApplicationContext context=
				new AnnotationConfigApplicationContext(MyConfigurations.class);
		
		//Employee employee=context.getBean(Employee.class);
		/*Employee employee=(Employee)context.getBean("employee1");
		employee.setFirstName("Kamal");
		System.out.println(employee);*/
		
		Employee employee1=(Employee)context.getBean("employee");
		System.out.println(employee1);
		
	}

}
