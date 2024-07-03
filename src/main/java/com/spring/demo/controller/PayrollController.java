package com.spring.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.spring.demo.ServiceImp.EmployeeServiceImp;
import com.spring.demo.ServiceImp.PayrollServiceImp;
import com.spring.demo.model.Employee;
import com.spring.demo.model.Payroll;


@RestController
@RequestMapping("/payroll")
@CrossOrigin("*")

public class PayrollController {
	
	@Autowired
	PayrollServiceImp service;
	
	@PostMapping
	public String insertPayroll(@RequestBody Payroll p) {
		String msg="";
		
		try {
			service.addPayroll(p);
			msg ="Success";
			
		}catch(Exception e) {
			
			e.printStackTrace();
			msg="Failure";
		}
		return  msg;
	}
	
	@GetMapping("{pid}")
	public Payroll readPayroll(@PathVariable("pid") int pid) {
		
		return service.getPayroll(pid);
	}
	
	
	@GetMapping("/all")
	public List<Payroll> getPayroll() {
		
		return service.getAllPayroll();
	}
	
	@PutMapping
	public String updatePayroll(@RequestBody Payroll p) {
		String msg="";
		
		try {
			service.updatePayroll(p);
			msg ="Success";
			
		}catch(Exception e){
			
			e.printStackTrace();
			msg="Failure";
		}
		return  msg;
	}
	
	@DeleteMapping("{pid}")
	public String deletePayroll(@PathVariable("pid") int pid) {
		
         String msg="";
		
		try {
			service.deletePayroll(pid);
			msg ="Success";
			
		}catch(Exception e) {
			
			e.printStackTrace();
			msg="Failure";
		}
		
		return  msg;

	}
	
	@GetMapping("/idList")
	public List<Integer> getAllPids(){
		return service.fetchAllPids();
		
	}
	

}
