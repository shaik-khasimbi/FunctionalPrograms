package com.example.demo.functional;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

class Employee1 {
	private int id;
	private String fname;
	private String lname;
	private int scoreCard;
	private String course;

	public Employee1(int id, String fname,String lname, int scoreCard, String course) {
		super();
		this.id = id;
		this.fname = fname;
		this.lname = lname;
		this.scoreCard = scoreCard;
		this.course = course;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFname() {
		return fname;
	}

	public void setFname(String fname) {
		this.fname = fname;
	}

	public String getLname() {
		return lname;
	}

	public void setLname(String lname) {
		this.lname = lname;
	}

	public int getScoreCard() {
		return scoreCard;
	}

	public void setScoreCard(int scoreCard) {
		this.scoreCard = scoreCard;
	}

	public String getCourse() {
		return course;
	}

	public void setCourse(String course) {
		this.course = course;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", fname=" + fname + ",lname=" + lname + ", scoreCard=" + scoreCard + ", course=" + course + "]";
	}

}

public class EP05 {

	public static void main(String[] args) {
		List<Employee1> employee = new ArrayList<>();

		employee.add(new Employee1(1, "Ayan", "Shaik", 98, "AWS"));
		employee.add(new Employee1(8, "John",  "Rob", 95, "COULD"));
		employee.add(new Employee1(5, "Rob", "Meo", 91, "REST API"));
		employee.add(new Employee1(4, "Dale", "Leo", 92, "Micro Services"));
		employee.add(new Employee1(2, "David", "Robbin", 93, "JAVA"));
		employee.add(new Employee1(3, "Tom", "Henny", 90, "AZURE"));

		System.out.println(employee.stream().allMatch(emp -> emp.getScoreCard() > 95));
		System.out.println(employee.stream().noneMatch(emp -> emp.getScoreCard() > 95));
		System.out.println(employee.stream().anyMatch(emp -> emp.getScoreCard() > 95));

		System.out.println(employee.stream().filter(emp -> emp.getScoreCard() >= 95)
				.sorted(Comparator.comparing(Employee1::getId).thenComparing(Employee1::getScoreCard).reversed())
				.collect(Collectors.toList()));

		System.out.println(
				employee.stream().sorted(Comparator.comparing(Employee1::getId).thenComparing(Employee1::getScoreCard))
						.skip(2).collect(Collectors.toList()));
		
		System.out.println(employee.stream().filter(emp-> emp.getScoreCard() > 91).map(emp -> emp.getFname() + " " +emp.getLname()).collect(Collectors.toList()));

	}

}
