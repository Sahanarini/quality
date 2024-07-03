package com.spring.demo.ServiceImp;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.spring.demo.model.Employee;
import com.spring.demo.repo.EmployeeRepo;
import com.spring.demo.service.EmployeeService;

@Service
public class EmployeeServiceImp  implements EmployeeService{

	@Autowired
	EmployeeRepo repo;
	
	@Override
	public void addEmployee(Employee emp) {
		repo.save(emp);
	}

	@Override
	public Employee getEmployee(int id) {
		// TODO Auto-generated method stub
		return repo.findById(id).get();
	}

	@Override
	public List<Employee> getAllEmployees() {
		// TODO Auto-generated method stub
		return repo.findAll();
	}

	@Override
	public void updateEmployee(Employee emp) {
		// TODO Auto-generated method stub
		repo.save(emp);
	}

	@Override
	public void deleteEmployee(int id) {
		// TODO Auto-generated method stub
		repo.deleteById(id);
	}
	
	
	

}
