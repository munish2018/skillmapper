package com.niitmrt.Backend.dao;

import java.util.List;

import javax.transaction.Transactional;

import org.hibernate.Query;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.niitmrt.Backend.model.Employee;

@Repository("employeeDAO")
@Transactional
public class EmployeeDAOImpl implements EmployeeDAO {

	@Autowired
	private SessionFactory sessionFactory;

	public List<Employee> findAll() {
		return (List<Employee>)sessionFactory.getCurrentSession()
				.createQuery("from Employee")
				.list();
	}

	public Employee findById(int empId) {
		return (Employee)sessionFactory.getCurrentSession()
				.createQuery("from Employee where empId="+empId)
				.uniqueResult();
	}

	public Employee findByEMail(String empemail) {
		return (Employee)sessionFactory.getCurrentSession().get(Employee.class, empemail);

	}

	public Employee checkEMail(String empemail, String emppasswd) {
		return (Employee)sessionFactory.getCurrentSession()
				.createQuery("from Employee where emailId='"+empemail+"' and empPassword='"+emppasswd+"'")
				.uniqueResult();
		
		/*
		 Query query=sessionFactory.getOpenSession().
				 createQuery(" from Employee where emailId='" +empamail+"' and password='"+password+"'");
		 Employee emp=(Employee)query.uniqueResult();
		 if (emp!=true)
		     return emp;
		 else
			 return false;
		 */
		
	}

	public boolean addEmployee(Employee employee) {
		sessionFactory.getCurrentSession().save(employee);
		return true;
	}

	public boolean updateEmployee(Employee employee) {
		sessionFactory.getCurrentSession().update(employee);
		return true;
	}

	public boolean deleteEmployee(int empId) {
		sessionFactory.getCurrentSession().delete(findById(empId));	
		return true;

	}

}
