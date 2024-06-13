package com.example.demo.java8;

import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class DuplicateCharactersInString {

	public static void main(String[] args) {
		
		String inputValue = "Hello Ayan How are you How was your day";
		String  duplicateCharacters = getDuplicateCharacters(inputValue);
		System.out.println(duplicateCharacters);
		
		Map<String, Long> map = inputValue.codePoints().mapToObj(Character::toString).collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
		Map<String, Long> map1 = inputValue.chars().mapToObj(Character::toString).collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
		System.out.println(map1);
		System.out.println(map);
		
		if(getAllUniqueCharacters(inputValue)) {
			System.out.println("Output : True");
		}else {
			System.out.println("output: false");
		}


		
	}

	private static String getDuplicateCharacters(String inputValue) {
		
		String inputString = inputValue.toLowerCase().replaceAll("\\s", "");
		
		String duplicatesInInputString = inputString.chars().mapToObj(c->(char) c).collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
				.entrySet().stream().filter(entry->entry.getValue()>1).map(Map.Entry::getKey).map(String::valueOf).collect(Collectors.joining(","));
		
		return duplicatesInInputString;
	}
	
private static boolean getAllUniqueCharacters(String inputValue) {
		
		String inputString = inputValue.toLowerCase().replaceAll("\\s", "");
		
		boolean uniqueCharacters = inputString.chars().mapToObj(c->(char) c).collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
				.entrySet().stream().anyMatch(entry->entry.getValue()>1);
		
		
		return uniqueCharacters;
	}

}
