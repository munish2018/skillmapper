package com.niitmrt.Backend.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import org.springframework.lang.NonNull;

@Entity
@Table
public class Employee {
	@Id
	private int empId;
	@NonNull
	private String empName;
	@NonNull
	@Column(unique=true)
	private String emailId;
	@NonNull
	private String empPassword;
	@NonNull
	private String empGender;
	@NonNull
	private String empContactNo;
	@NonNull
	private String empAddress;
	private String empQualification;
	private String empDivision;
	private String empDesignation;
	private String empSpecialization;
	private int empExperience;
	private String empRole;
	private String empIsApproved;
	private int empTimeViewed;	
	private String empImage;
	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public String getEmailId() {
		return emailId;
	}
	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}
	public String getEmpPassword() {
		return empPassword;
	}
	public void setEmpPassword(String empPassword) {
		this.empPassword = empPassword;
	}
	public String getEmpGender() {
		return empGender;
	}
	public void setEmpGender(String empGender) {
		this.empGender = empGender;
	}
	public String getEmpContactNo() {
		return empContactNo;
	}
	public void setEmpContactNo(String empContactNo) {
		this.empContactNo = empContactNo;
	}
	public String getEmpAddress() {
		return empAddress;
	}
	public void setEmpAddress(String empAddress) {
		this.empAddress = empAddress;
	}
	public String getEmpQualification() {
		return empQualification;
	}
	public void setEmpQualification(String empQualification) {
		this.empQualification = empQualification;
	}
	public String getEmpDivision() {
		return empDivision;
	}
	public void setEmpDivision(String empDivision) {
		this.empDivision = empDivision;
	}
	public String getEmpDesignation() {
		return empDesignation;
	}
	public void setEmpDesignation(String empDesignation) {
		this.empDesignation = empDesignation;
	}
	public String getEmpSpecialization() {
		return empSpecialization;
	}
	public void setEmpSpecialization(String empSpecialization) {
		this.empSpecialization = empSpecialization;
	}
	public int getEmpExperience() {
		return empExperience;
	}
	public void setEmpExperience(int empExperience) {
		this.empExperience = empExperience;
	}
	public String getEmpRole() {
		return empRole;
	}
	public void setEmpRole(String empRole) {
		this.empRole = empRole;
	}
	public String getEmpIsApproved() {
		return empIsApproved;
	}
	public void setEmpIsApproved(String empIsApproved) {
		this.empIsApproved = empIsApproved;
	}
	public int getEmpTimeViewed() {
		return empTimeViewed;
	}
	public void setEmpTimeViewed(int empTimeViewed) {
		this.empTimeViewed = empTimeViewed;
	}
	public String getEmpImage() {
		return empImage;
	}
	public void setEmpImage(String empImage) {
		this.empImage = empImage;
	}
}
