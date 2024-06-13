package com.example.demo.functional;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

class Employee {
	private int id;
	private String name;
	private Map<String, Integer> scorecard;
	private String course;
	private double salary;
	public Employee(int id, String name, Map<String, Integer> scorecard, String course, double salary) {
		super();
		this.id = id;
		this.name = name;
		this.scorecard = scorecard;
		this.course = course;
		this.salary = salary;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Map<String, Integer> getScorecard() {
		return scorecard;
	}
	public void setScorecard(Map<String, Integer> scorecard) {
		this.scorecard = scorecard;
	}
	public String getCourse() {
		return course;
	}
	public void setCourse(String course) {
		this.course = course;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", scorecard=" + scorecard + ", course=" + course + ", salary="+ salary +"]";
	}
		
}

class Employee2{
	private int id ;
	private String name;
	
	public Employee2(int id2, String name2) {
		this.id = id2;
		this.name = name2;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
}
public class EP04 {

	public static void main(String[] args) {
		List<Employee> employee = new ArrayList<Employee>();
		employee.add(new Employee(1, "Ayan", Map.of("Java", 99, "Python", 94), "AWS", 10000));
		employee.add(new Employee(5, "Baby", Map.of("Java", 95, "Python", 96), "Microservices", 25000));
		employee.add(new Employee(7, "John", Map.of("Java", 90, "Python", 98), "RestAPI", 40000));
		employee.add(new Employee(6, "John", Map.of("Java", 98, "Python", 97), "RestAPI", 15000));
		employee.add(new Employee(4, "Rob", Map.of("Java", 91, "Python", 91), "Azure", 20000));
		
		//Comparator<Employee> comparingScoreCard = Comparator.comparing(Employee::getScoreCard);
		//System.out.println(employee.stream().sorted(Employee::getName).collect(Collectors.toList()));
		//employee.stream().sorted(Comparator.comparing(Employee::getName)).collect(Collectors.toList())
		
		   List<Employee> sortedEmployees = employee.stream()
	                .filter(emp -> emp.getScorecard().values().stream().anyMatch(score -> score > 95))
	                .sorted(Comparator.comparing((Employee e) -> e.getScorecard().values().stream().filter(score -> score > 95).findFirst().orElse(0)).reversed())
	                .toList();
		   System.out.println(sortedEmployees);
		   
		   Set<Integer> employeeIds = Set.of(1, 5, 7);
		   
		   System.out.println(employee.stream().filter(emp -> employeeIds.contains(emp.getId())).map(emp -> "id: "+emp.getId() + "," +"Course:"+ emp.getCourse()).collect(Collectors.toList()));
		   
		   System.out.println(employee.stream().filter(emp -> employeeIds.contains(emp.getId())).map(emp -> emp.getCourse()).collect(Collectors.toList()));
		   
		   System.out.println(employee.stream().filter(emp -> employeeIds.contains(emp.getId())).map(emp -> new Employee2(emp.getId(), emp.getName())).collect(Collectors.toList()));
		   
		   System.out.println(employee.stream().sorted(Comparator.comparing(Employee :: getId)).collect(Collectors.toMap(Employee :: getId, emp -> emp)));
		   
		   System.out.println(employee.stream().collect(Collectors.summarizingDouble(Employee :: getSalary)).getSum());
		   
		   
		 //  System.out.println(list.stream().filter(emp -> emp.getId.).map().collect(Collectors.toList()));
	}

	
	
}
