package com.example.demo.java8;

public class StringReverse {

	public static void main(String[] args) {
		
		String s = "Hello Ayan";
		for (int i=s.length();i>0;--i) {
			System.out.println(s.charAt(i-1));
		}
		
	}

}
