package com.example.demo.java8;

interface Default{
	 default void say() { //default method
		System.out.println("Hello");
	}
	 void sayHello(); //abstract method
}

class DefaultMethodExample implements Default{

	@Override
	public void sayHello() {
		System.out.println("Hello Ayan baby");
	}
	
}

public class DefaultMethods {

	public static void main(String[] args) {
		DefaultMethodExample df = new DefaultMethodExample();
		df.sayHello();
		df.say();
		
	}

}
