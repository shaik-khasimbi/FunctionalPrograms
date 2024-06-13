package com.example.demo.java8;

import java.util.Arrays;
import java.util.List;

public class FindHighValieInList {

	public static void main(String[] args) {
		List<Integer> values = Arrays.asList(20,15,30);
		String returnValue = getGreastValue(values);
		System.out.println(returnValue);
		
		//values.stream().map(n->n).max(null);
	}

	private static String getGreastValue(List<Integer> values) {
		int[] value = values.stream().mapToInt(n->n).toArray();
		return String.valueOf(Arrays.stream(value).max().orElseThrow());
		
	}

}
