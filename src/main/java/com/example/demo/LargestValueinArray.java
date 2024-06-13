package com.example.demo;

public class LargestValueinArray {

	public static void main(String[] args) {
		
		int[] intArray = {1,5,4,9,7,10};
		int max = intArray[0];
		for(int i=1; i < intArray.length; i++) {
			if(intArray[i] > max) {
				max = intArray[i];
			}
		}
		System.out.println(max);
	}
	
}
