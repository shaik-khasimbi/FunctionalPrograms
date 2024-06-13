package com.example.demo.functional;

import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class EP02 {

	public static void main(String[] args) {
		
		List<Integer> numbers  = List.of(12,8,4,7,5,10,4,2,3,4);
		
		List<String> courses = List.of("Java","Spring","Lemon", "Hello", "Ayan Bro");
		
		//numbers.stream().distinct().forEach(System.out::println);
		//numbers.stream().distinct().sorted().forEach(System.out::println);
		
		//courses.stream().sorted(Comparator.reverseOrder()).forEach(System.out::println);
	//	courses.stream().sorted(Comparator.comparing(str-> str.length())).forEach(System.out::println);
		
		Optional<Integer> secondNumber = numbers.stream().distinct().sorted(Comparator.reverseOrder()).skip(1).findFirst();
		System.out.println(secondNumber);
		
		int sum = addListofNumbers(numbers);
		System.out.println(sum);
		
		int max = findMaxNumber(numbers);
		System.out.println(max);
		
		int sum1 = squareEveryNumbersum(numbers);
		System.out.println(sum1);

	}
	
	private static int squareEveryNumbersum(List<Integer> numbers) {
		return numbers.stream().map(n->n*n).reduce(0, Integer::sum);
		
	}

	private static int findMaxNumber(List<Integer> numbers) {
		return numbers.stream().reduce(Integer.MIN_VALUE, (x,y)-> x>y ? x:y);
	}

	private static int addListofNumbers(List<Integer> numbers) {
		return numbers.stream().reduce(0, Integer::sum);
		
	}

}
