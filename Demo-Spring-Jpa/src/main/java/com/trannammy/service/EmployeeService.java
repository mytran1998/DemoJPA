package com.trannammy.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.trannammy.bean.Employee;
import com.trannammy.repository.EmployeeRepository;

@Service
public class EmployeeService {

	@Autowired
	private EmployeeRepository employeeRepository;
	
	public Employee insertEmployee(Employee emp) {
		return employeeRepository.save(emp);
	}
	
	public List<Employee> findAll(){
		return employeeRepository.findAll();
	}
	
	public List<Employee> findById(int id){
		return employeeRepository.findById(id);
	}
}
