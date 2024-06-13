package com.example.demo.java8;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class RemoveDuplicates {

	public static void main(String[] args) {

		List<Integer> listOfValues = Arrays.asList(1,2,3,3,3,4,4,5,6,7,8,9);
		List<Integer> removeDuplicates = listOfValues.stream().distinct().collect(Collectors.toList());
		System.out.println(removeDuplicates);
		
		List<String> listOfValues1 = Arrays.asList("Apple","Lemon","Banana","Apple");
		List<String> removeDuplicates1 = listOfValues1.stream().distinct().collect(Collectors.toList());
		System.out.println(removeDuplicates1);
	}

	protected String getName() {
		return "Hello Praveen";
	}
}
