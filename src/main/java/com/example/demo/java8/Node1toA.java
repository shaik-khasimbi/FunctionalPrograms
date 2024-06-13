package com.example.demo.java8;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Node1toA {
	
	Map<Character, List<Character>> map = new HashMap<Character, List<Character>>();
	
	public Node1toA() {
		map = new HashMap<>();
	}
	
	
	public void addEdge(char from, char to) {
		map.computeIfAbsent(from, k-> new ArrayList<>()).add(to);
	}
	
	public void addEdge1(Character parent, Character child) {
		
		if(map.containsKey(parent)) {
			map.get(parent).add(child);
		} else {
			List<Character> childArray = new ArrayList<Character>();
			childArray.add(child);
			map.put(parent, childArray);
		}
		System.out.println(map);
	}
	
	
	
	public Character getparent(Character child) {
		Character parent = null;
		for(Map.Entry<Character, List<Character>> entry :map.entrySet()) {
			if(entry.getValue().contains(child)) {
				parent = entry.getKey();
			}
			
		}
		System.out.println(parent);
		return parent;
	}
	
	public List<Character> getChildren(Character parent) {
		
		List<Character> children = null;
		for(Map.Entry<Character, List<Character>>  entry : map.entrySet()) {
			if(entry.getKey().equals(parent)) {
				children = entry.getValue();
				
			}
		}
		System.out.println(children);
		return children;
	}
	
	public void printmap() {
		for(Map.Entry<Character, List<Character>> entry : map.entrySet()) {
			System.out.println(entry.getKey() + "->");
			for(char node: entry.getValue()){
				System.out.println(node+ "");
				
			}
			System.out.println();
			
		}
	}

	public static void main(String[] args) {
		
		Node1toA a = new Node1toA();
		a.addEdge('1', 'A');
		a.addEdge('A', 'C');
		a.addEdge('A', 'B');
		a.addEdge('B', 'D');
		a.addEdge('B', 'F');
		a.addEdge('C', 'F');
		
		a.addEdge1('B', 'F');
		a.addEdge1('C', 'F');
		a.printmap();
		
		a.getparent('B');
		a.getChildren('A');
		
	}

}
