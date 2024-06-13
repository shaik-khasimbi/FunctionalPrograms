package com.example.demo.functional;

public class SampleTestInfo {

	public static void main(String[] args) {
		
		Parent parent = new Child();
		parent.test();
	}
}

class Parent{
	public void test() {
		System.out.println("Parent");
	}
}

class Child extends Parent{
	public void test() {
		System.out.println("Child");
	}
}
