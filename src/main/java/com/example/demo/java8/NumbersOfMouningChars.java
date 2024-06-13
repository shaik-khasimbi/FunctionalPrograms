package com.example.demo.java8;

public class NumbersOfMouningChars {
	
	public static int getSolution(String input) {
		@SuppressWarnings("unused")
		int count= 0;
		int moveCount =0;
		
		for(int i=0; i<input.length(); i++) {
			input = input.substring(i)+input.charAt(0);
				count++;
			if(input.charAt(0) == input.charAt((input.length() -1))){
				moveCount ++;
			}
		}
		
		return moveCount;
	}

	public static void main(String[] args) {
		String  input = "aabba";
 		
		int value = getSolution(input);
		System.out.println(value);
		
		
	}

}
