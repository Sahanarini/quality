package com.spring.demo.controller;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.spring.demo.model.Employee;
import com.spring.demo.ServiceImp.EmployeeServiceImp;

@RestController
@RequestMapping("/employee")
@CrossOrigin("*")
public class EmployeeController {
	
	@Autowired
	EmployeeServiceImp service;
	
	@PostMapping
	public String insertStudent(@RequestBody Employee emp) {
		String msg="";
		
		try {
			service.addEmployee(emp);
			msg ="Success";
			
		}catch(Exception e) {
			
			e.printStackTrace();
			msg="Failure";
		}
		return  msg;
	}
	
	@GetMapping("{id}")
	public Employee readStudents(@PathVariable("id") int id) {
		
		return service.getEmployee(id);
	}
	
	
	@GetMapping("/all")
	public List<Employee> getEmployees() {
		
		return service.getAllEmployees();
	}
	
	@PutMapping
	public String updateStudent(@RequestBody Employee emp) {
		String msg="";
		
		try {
			service.updateEmployee(emp);
			msg ="Success";
			
		}catch(Exception e){
			
			e.printStackTrace();
			msg="Failure";
		}
		return  msg;
	}
	
	@DeleteMapping("{id}")
	public String deleteEmployee(@PathVariable("id") int id) {
		
         String msg="";
		
		try {
			service.deleteEmployee(id);
			msg ="Success";
			
		}catch(Exception e) {
			
			e.printStackTrace();
			msg="Failure";
		}
		
		return  msg;

	}
	
	
	}
