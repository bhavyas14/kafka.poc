package com.ibm.dbconnection.demo.service;

import java.util.List;

import com.ibm.dbconnection.demo.model.EmployeeDto;

public interface EmployeeService {

	public List<EmployeeDto> getEmployeesList();
	
	public String getEmployeeById(String id);
	
	public String getEmployeeByDept(String department);
}
