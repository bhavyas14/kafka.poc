package com.ibm.dbconnection.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.ibm.dbconnection.demo.model.EmployeeDto;
import com.ibm.dbconnection.demo.service.EmployeeService;

@RestController
public class EmployeeController {
	
	@Autowired
	EmployeeService service;
	
	@GetMapping("/employees")
	public ResponseEntity<List<EmployeeDto>> getEmployees()
	{
		return ResponseEntity.status(HttpStatus.OK).body(service.getEmployeesList());
	}
	
	@GetMapping("/employee/{id}")
	public String getEmployeeById(@PathVariable String id)
	{
		return service.getEmployeeById(id);
	}
	
	@GetMapping("/employee")
	public String getEmployeeByDept(@RequestParam String department)
	{
		return service.getEmployeeByDept(department);
	}

}
