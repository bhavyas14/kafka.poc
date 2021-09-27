package com.ibm.dbconnection.demo.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ibm.dbconnection.demo.model.Employee;
import com.ibm.dbconnection.demo.model.EmployeeDto;
import com.ibm.dbconnection.demo.repository.EmployeeRepository;

@Service
public class EmployeeServiceImpl implements EmployeeService{
	
	@Autowired
	EmployeeRepository repository;

	@Override
	public List<EmployeeDto> getEmployeesList() {
		return convert(repository.findAll());
	}
	
	@Override
	public String getEmployeeById(String id) {
		
		Optional<Employee> employeeOptional = repository.findById(Long.valueOf(id));
		if (employeeOptional.isPresent())
		{
			Employee employee = employeeOptional.get();
			return String.format("%s %s", employee.getFirst_name(), employee.getLast_name());
		}
		return null;
	}
	
	@Override
	public String getEmployeeByDept(String department) {
		Employee employee = repository.getEmployeesByDept(department);
		return String.format("%s %s", employee.getFirst_name(), employee.getLast_name());
	}
	
	private List<EmployeeDto> convert(List<Employee> employees)
	{
		List<EmployeeDto> list = new ArrayList<>();
		employees.forEach(e -> {
			EmployeeDto dto = new EmployeeDto(e.getFirst_name(), e.getLast_name());
			list.add(dto);
		});
		return list;
	}		

}
