package com.example.demo;

public class SwappingVariables {

	public static void main(String[] args) {
		int x = 10;
		int y= 20;
		int temp;
		temp =x;
		x= y;
		y = temp;
		System.out.println("x = " +x+ "y =" +y);

	}

}
