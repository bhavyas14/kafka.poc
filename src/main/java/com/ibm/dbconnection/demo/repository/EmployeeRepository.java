package com.ibm.dbconnection.demo.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.ibm.dbconnection.demo.model.Employee;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee,Long> {
	
	//Fetch list of employees with the given last name
	List<Employee> findByLastName(String lastName);
	
	//Fetch employee object by Id 
	Optional<Employee> findById(Long id);
	
	/*Fetch employee by the passed department
	 * Example of custom query 
	 * */	 
	@Query("SELECT e FROM Employee e WHERE e.department = ?1")
	Employee getEmployeesByDept(String department);

}
