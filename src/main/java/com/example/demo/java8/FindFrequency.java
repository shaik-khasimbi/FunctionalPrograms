package com.example.demo.java8;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FindFrequency {
	
	public static Map<String, Integer> getFrequencyMap(List<String> listOfStrings){
		Map<String, Integer> frequencyMap = new HashMap<>();
		for(String s : listOfStrings) {
			if(frequencyMap.containsKey(s)) {
				frequencyMap.put(s, frequencyMap.get(s)+1);
			}else {
				frequencyMap.put(s, 1);
			}
		}
		
		
		return frequencyMap;
		
	}

	public static void main(String[] args) {
		List<String> listOfStrings = Arrays.asList("Apple","Banana","Apple","Lemon","Stabeery","Apple");
		Map<String, Integer> frequencyValues =  getFrequencyMap(listOfStrings);
		System.out.println(frequencyValues);
	}

}
