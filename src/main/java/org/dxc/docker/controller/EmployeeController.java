package org.dxc.docker.controller;

import org.dxc.docker.model.Employee;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmployeeController {
	
	@RequestMapping("/employee")
	public Employee EmployeeDetails(Employee employee) {
		Employee emp=new Employee();
		emp.setEmployeename("tarun");
		emp.setEmail("tarun@gmail.com");
		emp.setMobile("9876123129");
		return emp;
		
	}
	

}
