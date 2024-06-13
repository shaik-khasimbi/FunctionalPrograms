package com.example.demo.functional;

import java.util.List;

public class EP01 {

	public static void main(String[] args) {
		List<Integer> numbers  = List.of(12,8,4,7,5,10,4,2,3);
		
		List<String> courses = List.of("Java","Spring","Lemon", "Hello", "Ayan Bro");
		
		//printSquaresOfEvenNumbers(numbers);
		printCubesOfoddNumbers(numbers);
		printCourseLength(courses);
		
		//numbers.stream().forEach(System.out::print);
	}

	private static void printCourseLength(List<String> courses) {
		courses.stream().map(course ->course.length()).forEach(System.out::println);
	}

	private static void printCubesOfoddNumbers(List<Integer> numbers) {
		numbers.stream().filter(n -> n%2 !=0).map(n -> n*n*n).forEach(System.out::println);
		
	}

	private static void printSquaresOfEvenNumbers(List<Integer> numbers) {
		numbers.stream().filter(number -> number%2 == 0).map(number -> number * number).forEach(System.out::println);
	}

}
