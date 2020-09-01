package org.dxc.docker.controller;

import org.dxc.docker.model.Employee;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmployeeController {
	
	@RequestMapping("/employee")
	public Employee displayEmployee() {
		Employee emp1=new Employee();
		emp1.setEmpName("Arun");
		emp1.setEmpid(101);
		emp1.setEmail("arun@gmail.com");
		return emp1;
		
		
	}

}
