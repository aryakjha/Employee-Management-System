package com.employee.demo.model;

import org.springframework.data.annotation.Id;


public class employee{
	
	@Id
	private String empName;
	private Integer empId;
	private String role;
	

	public employee(String empName, Integer empId, String role) {
		this.empName = empName;
		this.empId = empId;
		this.role = role;
	}
	
	
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public Integer getEmpId() {
		return empId;
	}
	public void setEmpId(Integer empId) {
		this.empId = empId;
	}
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}
	@Override
	public String toString() {
		return "employee [empName=" + empName + ", empId=" + empId + ", role=" + role + "]";
	}
}