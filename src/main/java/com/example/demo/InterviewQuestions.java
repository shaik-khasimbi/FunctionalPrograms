package com.example.demo;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class InterviewQuestions {

	public static void main(String[] args) {
		
		List<Integer> list = Arrays.asList(1,5,8,7,4,1,4,8,4,6);
		//sum of list elements
		System.out.println(list.stream().mapToInt(Integer::intValue).sum());
		// sorting list of elements
		System.out.println(list.stream().sorted().collect(Collectors.toList()));
		// distinct elements
		System.out.println(list.stream().distinct().collect(Collectors.toList()));
		//max element 
		System.out.println(list.stream().mapToInt(Integer::intValue).max());
		//count of list
		System.out.println(list.stream().mapToInt(Integer::intValue).count());
		//reverse order
		System.out.println(list.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList()));
		//find duplicate numbers of list
		System.out.println(list.stream().collect(Collectors.groupingBy(Function.identity(), Collectors.counting())).entrySet().stream().filter(entry -> entry.getValue() >1).map(Map.Entry::getKey).collect(Collectors.toList()));
		//find unique numbers of list
		System.out.println(list.stream().collect(Collectors.groupingBy(Function.identity(), Collectors.counting())).entrySet().stream().filter(entry -> entry.getValue() == 1).map(Map.Entry::getKey).collect(Collectors.toList()));
		//find first unique number from the list
		System.out.println(list.stream().collect(Collectors.groupingBy(Function.identity(), Collectors.counting())).entrySet().stream().filter(entry -> entry.getValue() == 1).map(Map.Entry::getKey).collect(Collectors.toList()));
		//find even numbers and odd numbers from list and reverse the list
		System.out.println(list.stream().collect(Collectors.groupingBy(n-> n%2==0 ? "even" : "odd")));
		// move ones all at first
		System.out.println(Stream.concat(list.stream().filter(n -> n==1), list.stream().filter(n-> n != 1)).collect(Collectors.toList()));
		//if element is there then return value from list or not return -1
		int value = 9;
		System.out.println(list.stream().filter(n -> n == value).findFirst().orElse(-1));
		
		
		
		// sort the numbers and reverse with in the List of numbers
		//List<Integer> listofIntergers = Arrays.asList(1847,4512,7819,4581);
		//System.out.println(listofIntergers.stream().sorted(in).collect(Collectors.toList()));
		
		//find duplicates from given string
		String str = "Hello how are you how was doing 123";
		System.out.println(str.chars().mapToObj(Character :: toString).collect(Collectors.groupingBy(Function.identity(), Collectors.counting())).entrySet().stream().filter(entry -> entry.getValue() > 1).map(Map.Entry::getKey).collect(Collectors.toList()));
		
		//find the unique chars from the given String
		System.out.println(str.chars().mapToObj(Character :: toString).collect(Collectors.groupingBy(Function.identity(), Collectors.counting())).entrySet().stream().filter(entry -> entry.getValue() == 1)
				.map(Map.Entry::getKey).sorted().collect(Collectors.toList()));
		
		//find the  chars count from the given String
				System.out.println(str.chars().mapToObj(Character :: toString).collect(Collectors.groupingBy(Function.identity(), Collectors.counting())).entrySet().stream()
						.map(entry -> entry.getKey() + "=" +entry.getValue()).sorted().collect(Collectors.toList()));
		
		//Split the strings and print reverse order
		List<String> reverseString = Arrays.asList(str.split(" "));
		Collections.reverse(reverseString);
		System.out.println(reverseString.stream().collect(Collectors.toList()));
		System.out.println(Arrays.stream(str.split("\\s")).reduce((first, second) ->second + " "+first).orElse(""));
		System.out.println(str.chars().filter(Character::isUpperCase).count()); 
		System.out.println(str.chars().filter(Character::isLowerCase).count()); 
		System.out.println(str.chars().filter(Character::isDigit).count()); 
		
	}
	

}
