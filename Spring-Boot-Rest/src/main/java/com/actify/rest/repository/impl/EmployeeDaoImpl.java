package com.actify.rest.repository.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.actify.rest.model.Employee;
import com.actify.rest.repository.EmployeeDao;
import com.actify.rest.repository.EmployeeRepository;

@Repository
public class EmployeeDaoImpl implements EmployeeDao{

	@Autowired
	private EmployeeRepository employeeRepository;
	
	public List<Employee> getEmployees() {
		List<Employee> empList = employeeRepository.findAll();
		return empList;
	}
	
	public String deleteEmployee(Long id) {
		String msg="Employee id "+id+" deleted";
		try {
			employeeRepository.deleteById(id);			
		}catch (Exception e) {
			msg="Unable to process your request";
			System.out.println("ERROR:: deleteEmployee :: "+e);
		}
		return msg;
	}
}
