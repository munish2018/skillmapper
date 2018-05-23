package com.niitmrt.Backend.service;

import java.util.List;

import com.niitmrt.Backend.model.Employee;

public interface EmployeeService {

	public List<Employee> findAll();
	public Employee findById(int empId);
	public Employee findByEMail(String empemail);
	public Employee checkEMail(String empemail,String emppasswd);
	public boolean addEmployee(Employee employee);
	public boolean updateEmployee(Employee employee);
	public boolean deleteEmployee(int empId);

	
}
