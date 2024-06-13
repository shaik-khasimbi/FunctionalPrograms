package com.example.demo.java8;

interface Function{
	default int calculate(int a, int b) {
		return a+b;
	}
	void sayHi();
	int hashCode();
}

class FunctionalInterfaceExample implements Function{

	@Override
	public void sayHi() {
		System.out.println("Implementation of abstract method");
	}

}

public class FunctionalInterface {

	public static void main(String[] args) {
		FunctionalInterfaceExample value = new FunctionalInterfaceExample();
		value.sayHi();
	}

}
