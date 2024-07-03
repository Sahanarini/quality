package com.spring.demo.ServiceImp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.spring.demo.model.Payroll;
import com.spring.demo.repo.PayrollRepo;
import com.spring.demo.service.PayrollService;

@Service
public class PayrollServiceImp implements PayrollService {
	
	@Autowired
	PayrollRepo repo;

	public void addPayroll(Payroll p) {
		// TODO Auto-generated method stub
		repo.save(p);
	}

	public Payroll getPayroll(int pid) {
		// TODO Auto-generated method stub
		return repo.findById(pid).get();
	}

	public List<Payroll> getAllPayroll() {
		// TODO Auto-generated method stub
		return repo.findAll();
	}

	public void deletePayroll(int pid) {
		// TODO Auto-generated method stub
		repo.deleteById(pid);
	}
	
	public void updatePayroll(Payroll p) {
		// TODO Auto-generated method stub
		repo.save(p);
	}

	public List<Integer> getAllPids() {
		// TODO Auto-generated method stub
		List<Integer> idList= repo.fetchAllPids();
		
		return idList;
		}

	@Override
	public List<Integer> fetchAllPids() {
		// TODO Auto-generated method stub
		List<Integer> idList = repo.fetchAllPids();
		return idList;
	}

	

}
