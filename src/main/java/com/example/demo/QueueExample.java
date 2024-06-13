package com.example.demo;

import java.util.Comparator;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Queue;

class StringLenthComparator implements Comparator<String>{

	@Override
	public int compare(String value1, String value2) {
		return Integer.compare(value1.length(), value2.length());
	}
	
}
public class QueueExample {

	public static void main(String[] args) {

		Queue<String> query = new PriorityQueue<>(new StringLenthComparator());
		System.out.println(query.poll());
		query.offer("hony");
		System.out.println(query);
		query.addAll(List.of("Apple","ball", "cat","Monkey"));
		System.out.println(query);
		System.out.println(query.poll());
		System.out.println(query);
		System.out.println(query.poll());
		System.out.println(query.poll());
		System.out.println(query.poll());
	}

}
