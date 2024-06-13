package com.example.demo;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ABC {

	Map<Character, List<Character>> map = new HashMap<Character, List<Character>>();

	public void addNode(Character parent, Character child) {

		if (map.containsKey(parent)) {
			if (map.containsKey(child) && map.get(child).contains(parent)) {
				System.out.println("Invalid entry");
			} else {
				List<Character> existingchilderen = map.get(parent);
				existingchilderen.add(child);
				map.put(parent, existingchilderen);
			}

		} else {
			List<Character> childList = new ArrayList<Character>();
			childList.add(child);
			map.put(parent, childList);

		}

		// map.computeIfAbsent(parent, child1 -> new ArrayList()).add(child);

	}

	public void dispalyHiraricy() {

		for (Map.Entry<Character, List<Character>> map1 : map.entrySet()) {
			System.out.println(map1.getKey() + "-->" + map1.getValue());

		}

	}

	public static void main(String[] args) {

		ABC a = new ABC();
		a.addNode('A', 'B');
		a.addNode('B', 'C');
		a.addNode('B', 'D');
		a.addNode('E', '2');
		a.addNode('E', '3');
		a.addNode('F', '5');
		a.addNode('B', 'A');

		a.dispalyHiraricy();

	}
}
