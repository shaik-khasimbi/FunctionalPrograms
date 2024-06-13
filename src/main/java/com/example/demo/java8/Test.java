package com.example.demo.java8;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Test {
	
	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(10,25,5,1,48,50);
		System.out.println(list);
		Collections.sort(list);
		System.out.println(list);
	}
}
