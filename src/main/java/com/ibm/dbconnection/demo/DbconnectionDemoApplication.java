package com.ibm.dbconnection.demo;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.ibm.dbconnection.demo.model.Employee;
import com.ibm.dbconnection.demo.repository.EmployeeRepository;

@SpringBootApplication
public class DbconnectionDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DbconnectionDemoApplication.class, args);
	}
	
	/* Method to create a Employee repository bean to save the passed values into the in-built H2 DB
	 * 
	 */
	@Bean
	public CommandLineRunner demo(EmployeeRepository repository)
	{
		return (args) ->
		{
	      repository.save(new Employee("Dan", "Brown", "HR"));
	      repository.save(new Employee("JK", "Rowling", "Finance"));	      
	    
		};		
	}

}
