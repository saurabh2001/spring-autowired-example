package com.springautowired.service;

import com.springautowired.model.Employee;

public class EmployeeService {

	private Employee employee;

	// constructor is used for autowire by constructor
	public EmployeeService(Employee emp) {
		System.out.println("Parameterized Constructor used");
		this.employee = emp;
	}

	// default constructor to avoid BeanInstantiationException for autowire
	// byName or byType
	public EmployeeService() {
		System.out.println("Default Constructor used");
	}

	// used for autowire byName and byType
	public void setEmployee(Employee emp) {
		this.employee = emp;
	}

	public Employee getEmployee() {
		return this.employee;
	}
}