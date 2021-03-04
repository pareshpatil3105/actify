package com.actify.rest.repository;

import java.util.List;

import com.actify.rest.model.Employee;

public interface EmployeeDao {

	public List<Employee> getEmployees();
	
	public String deleteEmployee(Long id);
}
