package com.example.demo.java8;

import java.util.Optional;

public class OptionalExample {

	public static void main(String[] args) {
		String[] stringArray = new String[10];
		stringArray[5] = "Hello Ayan Baby";
		Optional<String> optional = Optional.ofNullable(stringArray[5]);
		if(optional.isPresent()) {
			String value = stringArray[5].toLowerCase();
			System.out.println(value);
		} else {
			System.out.println("Value is not available");
		}
	}

}
