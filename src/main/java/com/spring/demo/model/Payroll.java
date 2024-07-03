package com.spring.demo.model;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "payroll")
public class Payroll {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int pid;
	@Column
	private int gsalary;
	@Column
	private int allow;
	@Column
	private int bonus;
	@Column
	private int salary;
 
	public Payroll() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Payroll(int pid, int gsalary, int allow, int bonus, int salary) {
		super();
		this.pid = pid;
		this.gsalary = gsalary;
		this.allow = allow;
		this.bonus = bonus;
		this.salary =  salary;
	}
 
	public int getPid() {
		return pid;
	}
 
	public void setPid(int pid) {
		this.pid = pid;
	}
 
	public int getGsalary() {
		return gsalary;
	}
 
	public void setGsalary(int gsalary) {
		this.gsalary = gsalary;
	}
 
	public int getAllow() {
		return allow;
	}
 
	public void setAllow(int allow) {
		this.allow = allow;
	}
 
	public int getBonus() {
		return bonus;
	}
 
	public void setBonus(int bonus) {
		this.bonus = bonus;
	}
 
	
 
	 public int getSalary() {
	        return salary;
	    }
 
 
 
	 public void setSalary(int salary) {
		    this.salary = salary;
		}
 
}
