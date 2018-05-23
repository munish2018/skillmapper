package com.niitmrt.Backend.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.niitmrt.Backend.dao.EmployeeDAO;
import com.niitmrt.Backend.model.Employee;

@Service
public class EmployeeServiceImpl implements EmployeeService {

	@Autowired
	private EmployeeDAO employeeDAO;
	
	@Override	
	public List<Employee> findAll() {
		return employeeDAO.findAll();
	}

	@Override
	public Employee findById(int empId) {
		Employee emp = employeeDAO.findById(empId);
			return emp;
	}

	@Override
	public Employee findByEMail(String empemail) {
		Employee emp = employeeDAO.findByEMail(empemail);
		return emp;
	}

	@Override
	public Employee checkEMail(String empemail, String emppasswd) {
		Employee emp=employeeDAO.checkEMail(empemail, emppasswd);
		return emp;
	}

	@Override
	public boolean addEmployee(Employee employee) {
		if (employeeDAO.findById(employee.getEmpId()) != null) {
			return false;
		} else {
			employeeDAO.addEmployee(employee);
			return true;
		}
	}

	@Override
	public boolean updateEmployee(Employee employee) {
		if (employeeDAO.findById(employee.getEmpId()) == null) {
			return false;
		} else {
			employeeDAO.updateEmployee(employee);
			return true;
		}
	}

	@Override
	public boolean deleteEmployee(int empId) {
		if (employeeDAO.findById(empId) == null) {
			return false;
		} else {
			employeeDAO.deleteEmployee(empId);
			return true;
		}
	}

}
