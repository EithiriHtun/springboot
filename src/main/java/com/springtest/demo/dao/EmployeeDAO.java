package com.springtest.demo.dao;

import java.util.List;

import com.springtest.demo.entity.Employee;

public interface EmployeeDAO {

	
	public List<Employee> findAll();
	
	public Employee findById(int theId);
	
	public void save(Employee theEmployee);
	
	public void deletebyId(int theID);
	
}
