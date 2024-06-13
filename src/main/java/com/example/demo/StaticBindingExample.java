package com.example.demo;

class Animal{
	public void makeSound() {
		System.out.println("animal sounds::");
	}
}

class Dog extends Animal{
	public void makeSound() {
		System.out.println("BOW.. BOW");
	}
}

class Cat extends Animal {
	public void makeSound() {
		System.out.println("maw..maw");
	}
}

public class StaticBindingExample {

	public static void main(String[] args) {
		/*
		 * Dog dog = new Dog(); dog.makeSound();
		 * 
		 * Cat cat = new Cat(); cat.makeSound();
		 */
		
		Animal animal = new Dog();
		animal.makeSound();
		
		Animal animalcat = new Cat();
		animalcat.makeSound();
		
		//System.out.println(dog);

	}

}
