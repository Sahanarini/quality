package com.spring.demo.model;
import org.springframework.beans.factory.annotation.Autowired;

import jakarta.persistence.*;

@Entity
@Table(name="emp_tb")
public class Employee {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	
	@Column
	private String name;
	
	@Column
	private String dept;
	
	@Column
	private String desg;
	
	
	@OneToOne(targetEntity= Payroll.class, cascade = CascadeType.ALL)
	private Payroll payroll;
	
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Payroll getPayroll() {
		return payroll;
	}


	public void setPayroll(Payroll payroll) {
		this.payroll = payroll;
	}

	public Employee(int id, String name, String dept, String desg) {
		super();
		this.id = id;
		this.name = name;
		this.dept = dept;
		this.desg = desg;
		
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDept() {
		return dept;
	}

	public void setDept(String dept) {
		this.dept = dept;
	}

	public String getDesg() {
		return desg;
	}

	public void setDesg(String desg) {
		this.desg = desg;
	}

	
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", dept=" + dept + ", desg=" + desg + ",]";
	}

	
}
