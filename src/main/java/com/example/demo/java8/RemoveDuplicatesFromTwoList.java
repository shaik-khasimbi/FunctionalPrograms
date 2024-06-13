package com.example.demo.java8;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class RemoveDuplicatesFromTwoList {

	public static void main(String[] args) {
		
		List<String> list1 = Arrays.asList("Apple", "Banana", "Apple","Lemon");
		List<String> list2 = Arrays.asList("Apple","John","David");
		Set<String> combinedSet = new HashSet<>();
		combinedSet.addAll(list1);
		combinedSet.addAll(list2);
		
		List<String> removeDuplicates = combinedSet.stream().collect(Collectors.toList());
		System.out.println(removeDuplicates);
		System.out.println(combinedSet);
		
	}

}
