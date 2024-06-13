package com.example.demo.java8;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class User {
	int id;
	String name;
	String emailId;

	public User(int id, String name, String emailId) {
		super();
		this.id = id;
		this.name = name;
		this.emailId = emailId;
	}
}

public class LamdaExpression {

	public static void main(String[] args) {
		
		List<User> list = new ArrayList<User>();
		list.add(new User(1,"Ayan","abc@gmail.com"));
		list.add(new User(2,"Abhi", "xyz@gamil.com"));
		
		Collections.sort(list,(p1,p2)->{
			return p1.name.compareTo(p2.name);
		});
		for(User user : list) {
			System.out.println(user.id + "name:" +user.name);
		}
		
		list.forEach(System.out::println);
		
	}

}
