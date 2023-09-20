package com.employee.CRUDOperation.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.employee.CRUDOperation.entity.Employee;
import com.employee.CRUDOperation.repository.EmployeeRepository;
import com.employee.CRUDOperation.service.EmployeeService;


@RestController
@RequestMapping("/employee")
public class EmployeeController {
	
	@Autowired
	EmployeeService employeeService;
	
	//responseEntity class include http , body,status code, header, coz  its class need to create object
	
	@PostMapping
	public ResponseEntity<Employee> createEmployee(@RequestBody Employee employee) {
		return new ResponseEntity<>(employeeService.createEmployee(employee),HttpStatus.CREATED);
		
	}
	
//	public Employee updateEmployee(Employee employee) {
//		return employee;
//		
//	}
//	
//	public List<Employee> getAllUsers() {
//		return null;
//	    
//    }
//	
//	 public void deleteEmployee(int id) {
//	    employeeRepository.deleteById(id);
//	 }

}
