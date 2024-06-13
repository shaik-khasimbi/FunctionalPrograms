package com.example.demo.java8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Test8 {
	public static int temp1 = 1;
	private static int temp2 = 2;
	public int temp3 = 3;
	private int temp4 = 4;

	public static class Inner {
		private static int temp5 = 5;

		private int getsumOf2() {
			return (temp1 + temp2);

		}

		/*
		 * private static int getsumOf5(){ //return (temp1 +temp4);
		 * 
		 * }
		 */
	}

	boolean[] arr = new boolean[3];
	int count = 0;

	void set(boolean[] arr, int x) {
		arr[x] = true;
		count++;
	}

	void fun() {
		if (arr[0] && arr[++count - 1] | arr[count - 2])
			count++;
		System.out.println("count=" + count);
	}

	public static void main(String[] args) throws InterruptedException, ExecutionException {
		/*
		 * String s1 = "a1b2c3"; String[] token = s1.split("\\d"); for(String s:token) {
		 * System.out.println(s);
		 * 
		 * } System.out.println(""); s1 = "a1b2c3"; String[] tokens = s1.split("[123]");
		 * for(String s:tokens) { System.out.println(s); } System.out.println(""); s1 =
		 * "d1e2f3"; String[] tokenss = s1.split("[def]"); for(String s:tokenss) {
		 * System.out.println(s); } System.out.println(""); s1 = "a1b2c3"; String[]
		 * tokenee = s1.split("[a-z]"); for(String s:tokenee) { System.out.println(s); }
		 * System.out.println(""); s1 = "x y z"; String[] tokenees = s1.split("\\s");
		 * for(String s:tokenees) { System.out.println(s); }
		 */		
		
		/*
		 * Test8 test = new Test8(); test.set(test.arr, 0); test.set(test.arr, 1);
		 * test.fun();
		 */
		
		/*	
		Test8.Inner obj = new Test8.Inner();
	//	System.out.println(obj.getsumOf5());
		
		int temp = 40;
		if(temp == 30 && temp/0 ==4) {
			System.out.println(1);
		}else {
			System.out.println(2);
		}
		
		
		 * for(int i =0; i>5;) { System.out.println("hello");
		 * 
		 * }
		 
		
		System.out.println(T.x);
		
		int[] org = new int[] {1,2,3};
		int[] org1 = Arrays.copyOf(org, 5);
		int[] org2 = Arrays.copyOfRange(org1, 0,4);
		for(int i = 0; i<org2.length; i++) {
			System.out.print(org2[i]+ "");
		}
		
		
		int a = 260;
		byte b = (byte)a;
		System.out.println(b);
	
		List<? extends Number> nums = new ArrayList<Number>();
		//nums.add(3.14);
		
		int x = -4;
		System.out.println(x >> 1);
		System.out.println("And");
		int y = 4;
		System.out.println(y>>2);
		
		
	}
	
	class T{
		public static final int x = 100;
	}
	
	static {
		System.out.println("Hello World");
	}
	}
*/
		
		ExecutorService es = Executors.newFixedThreadPool(5);
	}
}
