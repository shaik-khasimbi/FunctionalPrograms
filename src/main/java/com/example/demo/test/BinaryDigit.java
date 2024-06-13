package com.example.demo.test;

public class BinaryDigit {
	
	public static boolean getbinaryVaule(int x) {
		if(x==0 || x ==1 || x < 1) {
			return false;
		}
		
		while (x != 0) {
			if (x % 10 > 1) {
                return false;
            }
            x = x / 10;
		}
		return true;

	}

	public static void main(String[] args) {
		 int x = 1 ;
	//	boolean value = getbinaryVaule(x);
		if(getbinaryVaule(x))
		System.out.println("true");
		else {
			System.out.println("false");
		}

	}

}
