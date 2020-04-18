package com.trannammy.view;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.trannammy.bean.Employee;
import com.trannammy.service.EmployeeService;

public class Main {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("context.xml");
		EmployeeService employeeService = context.getBean("employeeService", EmployeeService.class);
		employeeService.insertEmployee(new Employee("Nam My", "nammy@gmail.com", "Hue", "03945152"));
		employeeService.insertEmployee(new Employee("Hieu", "nammy@gmail.com", "Hue", "03945152"));
		employeeService.insertEmployee(new Employee("Nghia", "nammy@gmail.com", "Hue", "03945152"));
		employeeService.insertEmployee(new Employee("Hoang", "nammy@gmail.com", "Hue", "03945152"));
		System.out.println("All employee: ");
		System.out.println(employeeService.findAll());
		System.out.println("find by id: ");
		System.out.println(employeeService.findById(3));
	}

}
