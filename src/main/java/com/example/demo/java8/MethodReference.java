package com.example.demo.java8;

import java.util.Arrays;
import java.util.List;
import java.util.function.BiFunction;
import java.util.function.Consumer;
import java.util.function.Function;

class StaticMethodReference{
	 static int add(int a, int b) {
		 return a+b;
	}
}

class InstanceMethodReference{
	public String sayInstance(String message) {
		return  message ;
	}
	
	public long add(String a, String b) {
		 return a.concat(b).chars().count();
	}
}

class Person{
	private String name;
	Person(String name){
		 this.name =name;
	}
	public String getName() {
		return name;
	}
}

public class MethodReference {

	public static void main(String[] args) {
		
		List<String> list = Arrays.asList("Ayan","Abhi","Praveen");
		list.forEach(System.out::println);
		
		//static reference
	BiFunction<Integer, Integer, Integer> add = StaticMethodReference::add;
	int result = add.apply(2, 3);
	System.out.println(result);
	 
	// instance reference
	InstanceMethodReference instanceMethodReference = new InstanceMethodReference();
	Consumer<String> printMessage= instanceMethodReference::sayInstance;
	//String message= instanceMethodReference::sayInstance;
	BiFunction<String, String, Long> addValue= instanceMethodReference::add;
	System.out.println(addValue.apply("444", "5"));
	printMessage.accept("Hello");
	
	// constructor reference
	Function<String, Person> constructreference = Person::new;
	Person person = constructreference.apply("Ayan");
	System.out.println(person.getName());
	
	}

}
