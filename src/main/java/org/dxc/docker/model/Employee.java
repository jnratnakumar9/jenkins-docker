package org.dxc.docker.model;


public class Employee {
	
	private String employeename;
	private String email;
	private String mobile;
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Employee(String employeename, String email, String mobile) {
		super();
		this.employeename = employeename;
		this.email = email;
		this.mobile = mobile;
	}
	public String getEmployeename() {
		return employeename;
	}
	public void setEmployeename(String employeename) {
		this.employeename = employeename;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getMobile() {
		return mobile;
	}
	public void setMobile(String string) {
		this.mobile = string;
	}
	@Override
	public String toString() {
		return "Employee [employeename=" + employeename + ", email=" + email + ", mobile=" + mobile + "]";
	}
	
	
	

}
