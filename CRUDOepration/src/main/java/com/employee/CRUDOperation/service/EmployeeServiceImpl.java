package com.employee.CRUDOperation.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.employee.CRUDOperation.entity.Employee;
import com.employee.CRUDOperation.repository.EmployeeRepository;

@Service

public class EmployeeServiceImpl implements EmployeeService {
	
	private EmployeeRepository employeeRepository; 

	@Override
	public Employee createEmployee(Employee employee) {
		
		return employeeRepository.save(employee);
	}

//	@Override
//	public Employee updateEmployee(Employee employee) {
//		
//		return employee;
//	}
//
//	@Override
//	public void deleteEmployee(int id) {
//		
//		
//	}
//
//	@Override
//	public List<Employee> getAllEmployeeById(int id) {
//		
//		return employeeRepository.findAll();
//	}
//
//	@Override
//	public List<Employee> getAllEmployee() {
//		
//		return null;
//	}

}
