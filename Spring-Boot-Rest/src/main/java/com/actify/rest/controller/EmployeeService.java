package com.actify.rest.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.actify.rest.model.Employee;
import com.actify.rest.repository.EmployeeDao;

@RestController
@RequestMapping("/employeeService")
public class EmployeeService {
	
	@Autowired
	private EmployeeDao employeeRepository;

	@GetMapping("/listAllEmployees")
	public List<Employee> getEmployees() {
		return employeeRepository.getEmployees();
	}
	
	@GetMapping("/deleteEmployee/{id}")
	public String deleteEmployee(@PathVariable("id") Long id) {
		if(id!=null) {
			return employeeRepository.deleteEmployee(id);
		}
		return "Id should not be null";	
	}
}
