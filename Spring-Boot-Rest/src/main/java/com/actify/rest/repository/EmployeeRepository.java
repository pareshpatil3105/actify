package com.actify.rest.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.actify.rest.model.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Long>{

}
