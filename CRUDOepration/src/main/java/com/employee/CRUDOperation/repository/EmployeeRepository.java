package com.employee.CRUDOperation.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.employee.CRUDOperation.entity.Employee;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee,Integer>  {
	

}