package com.example.demo;

import java.util.ArrayList;
import java.util.List;

public class Test2 {
	
	public static int temp1 = 1;
	private static int temp2 = 2;
	public  int temp3 = 3;
	private  int temp4 = 4;
	
	public class inner{
		private  int temp5 = 5;
		
		private int getSumof2() {
			return(temp1+temp2);
		}
		
		int getSumof4() {
			return(temp1+temp2 +temp4);
		}
		
		public int getSumof5() {
			return(temp1+temp2 +temp5);
		}
		
	}

	public static void main(String args[]) {
		// TODO Auto-generated method stub
		
		  Test2.inner test = new Test2().new inner(); 
		  System.out.println(test.getSumof2());
		  System.out.println(test.getSumof4());
		 
		//System.out.println(test.getSumof());
		
		char chars[] = {'a','d','e','i','k','n','V','v'};
		char moves[] = {6,5,4,3,10,4,5,3,5,3,1,7};
		int j= 0;
		
		for(char move : moves) {
			j += move;
			j %= chars.length;
			System.out.println(chars[j]);
			
			
		}
		
		/*
		 * String temp = "10.87"; int a = Integer.parseInt(temp); System.out.println(a);
		 */
		
		
		int x= 0;
		int y = 0;
		for(int z=0; z<5; z++) {
			if((++x>2) || (++y >2)) {
				x++;
			}
		}
		System.out.println(x + "" +y);
				
		
		
		System.out.print(10*20 +"ABC");
		System.out.println("DEF" + 10*20);
		
		/*
		 * int p =5; System.out.println("Hello"); 5<6?5:6;
		 */
		
		String s = "abc";
		String s1= "abc";
		System.out.println("output" +s == s1);
		

	}

}
