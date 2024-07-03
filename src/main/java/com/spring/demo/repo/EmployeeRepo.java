package com.spring.demo.repo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.spring.demo.model.Employee;


@Repository
public interface EmployeeRepo extends JpaRepository <Employee,Integer> {

	
}
