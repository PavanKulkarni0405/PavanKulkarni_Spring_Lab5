package com.greatlearning.ems.util;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.event.EventListener;

import com.greatlearning.ems.model.Employee;
import com.greatlearning.ems.repository.EmployeeJpaRepository;



public class BootstrapAppData {
	@Autowired
	private EmployeeJpaRepository employeeRepository;
	
	@EventListener(ApplicationReadyEvent.class)
	public void onReady(ApplicationReadyEvent event) {
		
		
		Employee employee = new Employee();
		employee.setFirstName("Navneet");
		employee.setLastName("Phadnis");
		employee.setEmail("naveneet@gmail.com");
		
		Employee employee1 = new Employee();
		employee1.setFirstName("Prashant");
		employee1.setLastName("Kumar");
		employee1.setEmail("prashant@gmail.com");
		
		this.employeeRepository.save(employee);
		this.employeeRepository.save(employee1);
		
		
		
	}

}
