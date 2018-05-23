package com.niitmrt.Backend.test;

import static org.junit.Assert.assertEquals;

import org.hibernate.exception.ConstraintViolationException;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.test.context.junit.jupiter.SpringJUnitConfig;
import org.springframework.test.context.junit4.SpringRunner;

import com.niitmrt.Backend.config.HibernateConfig;
import com.niitmrt.Backend.model.Employee;
import com.niitmrt.Backend.service.EmployeeService;



@RunWith(SpringRunner.class)
@SpringJUnitConfig(classes=HibernateConfig.class)
public class EmployeeTesting {

@Autowired
private EmployeeService employeeService;
private Employee emp;
	private static AnnotationConfigApplicationContext context;
	
	/*	
	@Test
	public void testAddEmployeeSuccess() {
		emp=employeeService.findById(4);
		if(emp!=null)
			employeeService.deleteEmployee(4);
			
		emp=new Employee();
		emp.setEmpId(4);
		emp.setEmpName("Shami");
		emp.setEmailId("shami@gmail.com");
		emp.setEmpPassword("shami");
		emp.setEmpGender("m");
		emp.setEmpContactNo("123456");
		emp.setEmpAddress("Meerut");
		assertEquals(true, employeeService.addEmployee(emp));
	}
	@Test
	public void testAddEmployeeFailure() {
		Employee emp=new Employee();
		emp.setEmpId(4);
		emp.setEmpName("Shami");
		emp.setEmailId("shami@gmail.com");
		emp.setEmpPassword("shami");
		emp.setEmpGender("m");
		emp.setEmpContactNo("123456");
		emp.setEmpAddress("Meerut");
		assertEquals(false, employeeService.addEmployee(emp));
	}
	
	
	@Test
	public void testModifyEmployee() {
		emp=employeeService.findById(1);
		if(emp!=null)
		{	
		emp.setEmpId(4);
		emp.setEmpName("Ajay");
		emp.setEmailId("ajay@gmail.com");
		emp.setEmpPassword("ajay");
		emp.setEmpGender("m");
		emp.setEmpContactNo("123456");
		emp.setEmpAddress("Meerut");
		assertEquals(true, employeeService.updateEmployee(emp));
		}
			
		}
	
	
	@Test
	public void testDeleteEmployee() {
		assertEquals(true, employeeService.deleteEmployee(4));
	}
	*/
	@Test
	public void testListAllEmployee() {
		assertEquals(2, employeeService.findAll().size());
	}

}

