package com.example.demo.functional;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class Test {

	public static void main(String[] args) {
		   String str = "Hello world How are you";
		List<String> words = Arrays.asList(str.split("\\s+"));
		//Collections.reverse(list);
		
		   //List<String> words = Arrays.asList(str.split("\\s+"));
	       Collections.reverse(words);
		//System.out.println(words.toString());
		//System.out.println(words.stream().collect(Collectors.joining(" ")));
		
		List<Integer> list = Arrays.asList(1245,5789,8451,1278);
		List<List<Integer>> sortedList = list.stream()
                .map(Test::sortDigits)
                .collect(Collectors.toList());
		sortedList.forEach(System.out::println);
	}
	
	 public static List<Integer> sortDigits(int num) {
	        return Arrays.stream(String.valueOf(num).split(""))
	                .map(Integer::parseInt)
	                .sorted()
	                .collect(Collectors.toList());
	    }
	
	

}
