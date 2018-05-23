
package com.niitmrt.Middleware.controller;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.niitmrt.Backend.model.Employee;
import com.niitmrt.Backend.service.EmployeeService;


@RestController
@RequestMapping("api/employee")
public class EmployeeController {

	
	@Autowired
	EmployeeService employeeService;
	private Employee emp;
	
	@GetMapping("/listemployee")
	public ResponseEntity <?> listEmployee()
	{
		List<Employee> list=(List<Employee>)employeeService.findAll();
		if(list!=null)
		   return new ResponseEntity<List<Employee>>(list,HttpStatus.OK);
		else
			return new ResponseEntity<List<Employee>>(list,HttpStatus.BAD_REQUEST);	
	}
	
	
	@PostMapping("/save")
	public ResponseEntity <?> addEmployee(@RequestBody Employee employee)
	{
		employeeService.addEmployee(employee);
		return new ResponseEntity<String>("data inserted",HttpStatus.CREATED);
	}
	
	@PostMapping("/deleteemp/{empId}")
	public ResponseEntity <?> delEmployee(@PathVariable("empId") int  empId)
	{
		boolean status=employeeService.deleteEmployee(empId);
		return new ResponseEntity<String>("data deleted",HttpStatus.OK);
	}
	
	@GetMapping("/getempbymailid/{emailId}")
	public ResponseEntity <?> searchEmployeebyemail(@PathVariable("emailId") String  emailId)
	{
		emp=employeeService.findByEMail(emailId);
		System.out.println(emp.getEmpName());
		return new ResponseEntity<Employee>(emp,HttpStatus.OK);
	}
	@GetMapping("/getempbyid/{empId}")
	public ResponseEntity <?> searchEmployeebyId(@PathVariable("empId") int  empId)
	{
		emp=employeeService.findById(empId);
		System.out.println(emp.getEmpName());
		return new ResponseEntity<Employee>(emp,HttpStatus.OK);
	}
	
	@PutMapping("/updempl")
	public ResponseEntity <?> modEmployee(@RequestBody Employee employee)
	{
			boolean status=employeeService.updateEmployee(employee);
			return new ResponseEntity<Employee>(employee,HttpStatus.OK);
	}
	/*
	@GetMapping("/chklogin/{emailId}/{passwd}")
	public ResponseEntity <?> chkLogin(@PathVariable("emailId") String  emailId,@PathVariable("passwd") String  passwd)
	{
		 emp=employeeService.checkEMail(emailId,passwd);
		return new ResponseEntity<Employee>(emp,HttpStatus.OK);
	}
	*/
	@PostMapping("/chklogin")
	public ResponseEntity <?> checkLogin(@RequestBody Employee employee,HttpSession session)
	{
		  emp=employeeService.checkEMail(employee.getEmailId(),employee.getEmpPassword());
		 session.setAttribute("username",employee.getEmailId());
		 session.setAttribute("passwd",employee.getEmpPassword());
		if(emp!=null)
			return new ResponseEntity<Employee>(emp,HttpStatus.OK);
		else
			return new ResponseEntity<Employee>(emp,HttpStatus.NOT_FOUND);
		
	}
	
	
	
}
