package com.example.demo;

import java.util.regex.Pattern;

public class Test3 {
	
	double a= 8;
	final int b= 9;
	public void foo(final int b) {
		//this.b = b;
	}
	
	public void foo(final double  a) {
		this.a = a;
	}
	public void foo(final Test3 test3) {
		test3.a = 10.0;
		//test3.b = 11;
	}
	
	
	
	
		
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Test3 test3 = new Test3();
		test3.foo(test3);
		test3.foo(8);
		
		System.out.println(Pattern.matches("[789]{1}[0-9]{9}", "9953038949"));
		System.out.println(Pattern.matches("[789][0-9]{9}", "9953038949"));
		System.out.println(Pattern.matches("[789][0-9]{9}", "99530389490"));
		System.out.println(Pattern.matches("[789][0-9]{9}", "6953038949"));
		System.out.println(Pattern.matches("[789]{1}\\d{9}", "8853038949"));
		
		
		int a = 260;
		byte b = (byte)a;
		System.out.println(b);
		
		double data = 20.324;
		int sum = 6;
		float value = 5.1f;
		System.out.println(data+sum+value);
		
		int x= 30;
		System.out.println(x);
	}
		
		static {
			int x = 10;
			System.out.println("" + x +"");
		}


}
