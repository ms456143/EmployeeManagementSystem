package com.Tcs.Ems.Model;

public class EmployeeEntity {

	private Integer empId;
	private String empName;
	private String empAddress;
	private String empEmail;
	private double empSalary;
	private Integer empAge;
	public Integer getEmpId() {
		return empId;
	}
	public void setEmpId(Integer empId) {
		this.empId = empId;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public String getEmpAddress() {
		return empAddress;
	}
	public void setEmpAddress(String empAddress) {
		this.empAddress = empAddress;
	}
	public String getEmpEmail() {
		return empEmail;
	}
	public void setEmpEmail(String empEmail) {
		this.empEmail = empEmail;
	}
	public double getEmpSalary() {
		return empSalary;
	}
	public void setEmpSalary(double empSalary) {
		this.empSalary = empSalary;
	}
	public Integer getEmpAge() {
		return empAge;
	}
	public void setEmpAge(Integer empAge) {
		this.empAge = empAge;
	}
	@Override
	public String toString() {
		return "EmployeeEntity [empId=" + empId + ", empName=" + empName + ", empAddress=" + empAddress + ", empEmail="
				+ empEmail + ", empSalary=" + empSalary + ", empAge=" + empAge + "]";
	}
	
	
	
}
