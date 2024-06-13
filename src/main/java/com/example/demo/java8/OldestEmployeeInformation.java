package com.example.demo.java8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

class Employee{
	private String name;
	private int age;
	
	public Employee(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	public int getAge() {
		return age;
	}
	
	public String getName() {
		return name;
	}
}

public class OldestEmployeeInformation {

	public static void main(String[] args) {

		List<Employee> employees = new ArrayList<Employee>();
		employees.add(new Employee("Ayan", 30));
		employees.add(new Employee("Praveen", 40));
		employees.add(new Employee("Arun", 32));
		
		Employee[] emp = {
				new Employee("Ayan", 1),
				new Employee("ABHI", 32),
				new Employee("Praveen", 35)
		} ;		
		Employee oldemployee=  Arrays.stream(emp).max(Comparator.comparingInt(Employee::getAge)).orElseThrow();
		
		System.out.println(oldemployee.getAge() + "----" +oldemployee.getName());
		
	}
	
}
