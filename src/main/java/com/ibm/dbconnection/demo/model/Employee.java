package com.ibm.dbconnection.demo.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Employee {	
	
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long id;	
	private String firstName;
	private String lastName;
	private String department;
	
	protected Employee()
	{
		//Default Constructor
	}
	
	public Employee(String firstName, String lastName)
	{
	  this.firstName= firstName; 
	  this.lastName = lastName;
	}
	
	public Employee(String firstName, String lastName, String department)
	{
	  this.firstName= firstName; 
	  this.lastName = lastName;
	  this.department = department;
	}
	
	public Long getId() {
		return id;
	}
	
	public String getFirst_name() {
		return firstName;
	}
	
	public String getLast_name() {
		return lastName;
	}
	
	public String getDepartment() {
		return department;
	}
	
	@Override
	public String toString() {
		return "Employee [id=" + id + ", first_name=" + firstName + ", last_name=" + lastName + ", department=" + department + "]";
	}

}
