package com.spring.demo.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.spring.demo.model.Employee;


public interface EmployeeService {
	public void addEmployee(Employee emp);
	public Employee getEmployee(int id);
	public List<Employee> getAllEmployees();
	public void updateEmployee(Employee emp);
	public void deleteEmployee(int id);
	

}
