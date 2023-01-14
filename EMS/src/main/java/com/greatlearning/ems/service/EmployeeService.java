package com.greatlearning.ems.service;

import java.util.List;

import com.greatlearning.ems.entity.Employee;

public interface EmployeeService {

	List<Employee> listEmployees();

	Employee saveEmployee(Employee employee);

	// Update - Start
	Employee getEmployeeById(int id);

	Employee updateEmployee(Employee employee);
	// Update - End

	void deleteById(int id);
}
