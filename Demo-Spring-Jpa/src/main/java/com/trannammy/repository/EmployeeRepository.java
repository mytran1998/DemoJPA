package com.trannammy.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.trannammy.bean.Employee;


public interface EmployeeRepository extends JpaRepository<Employee, Integer>{
	List<Employee> findAll();
	
	Employee save(Employee employee);
	
	List<Employee> findById(int id);
}
