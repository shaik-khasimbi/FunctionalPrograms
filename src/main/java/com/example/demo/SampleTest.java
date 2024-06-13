package com.example.demo;

public class SampleTest {
	
	int x = 3;
	static int y = 5;
	
	 SampleTest(int x, int y) {
		if(y<30) {
			this.y =y;
		}
		x=x;
		
	}

	public static void main(String[] args) {
		foo(null);
		
		SampleTest test = new SampleTest(9,10);
		SampleTest test1 = new SampleTest(12,22);
		System.out.println(test.x+ "" +test.y + "" +test1.x + "" + test1.y);
		
		
	
			
			
	}

	private static void foo(Object object) {
		// TODO Auto-generated method stub
		System.out.println("Objeimp");
		
	}
	
	private static void foo(String s) {
		// TODO Auto-generated method stub
		System.out.println("stirng impl");
		
	}
	
	
	
	

}
