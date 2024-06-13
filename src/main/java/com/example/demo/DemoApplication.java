package com.example.demo;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class DemoApplication {

	public static void main(String[] args) {
		// SpringApplication.run(DemoApplication.class, args);

		List<String> words = List.of("Apple", "Bat");
		//System.out.println(words);
		//words.add("banana");

		List<String> wordsArrayList = new ArrayList<String>(words);

		wordsArrayList.add("Ball");
		wordsArrayList.add(2, "Ant");

		List<String> list = List.of("cat", "nest");
		wordsArrayList.addAll(list);
		System.out.println(wordsArrayList);
		for(int i=0; i< wordsArrayList.size(); i++) {
			System.out.println(wordsArrayList.get(i));
		}
		for(String word : wordsArrayList) {
			System.out.println(word);
		}
		
		Iterator wordsit = wordsArrayList.iterator();
		while(wordsit.hasNext()) {
			//System.out.println("Hello");
			System.out.println(wordsit.next());
		}
		System.out.println(wordsArrayList);
		
		Iterator<String> itrator = wordsArrayList.iterator();
		while (itrator.hasNext()) {
			if(itrator.next().endsWith("at")) {
			itrator.remove();
			}
		}
		System.out.println(wordsArrayList);

	}

}
