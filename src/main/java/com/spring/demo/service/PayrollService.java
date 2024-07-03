package com.spring.demo.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.spring.demo.model.Payroll;


public interface PayrollService {
	public void addPayroll(Payroll p);
	public Payroll getPayroll(int pid);
	public List<Payroll> getAllPayroll();
	public void deletePayroll(int pid);
	public void updatePayroll(Payroll p);
	 List<Integer> fetchAllPids();



	

}
