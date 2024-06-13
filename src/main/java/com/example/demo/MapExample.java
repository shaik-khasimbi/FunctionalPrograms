package com.example.demo;

import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;
import java.util.function.Function;
import java.util.stream.Collectors;

class charchetarLength implements Comparable<String>{

	@Override
	public int compareTo(String o) {
		return 0;
	}
	
}

public class MapExample {

	public static void main(String[] args) {
		String str = "Hello World , hello how are you, you are looking so good.";
		String str1 = "Hello World";
		String[] stringArray = str.split(",");
		for(String string : stringArray) {
			System.out.println(string);
		}
		
		Map<String, Long> map1 = str1.codePoints().mapToObj(Character::toString).collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
		System.out.println(map1);
		
		
		Map<Character, Integer> occuarance = new HashMap<>();
		char[] characters = str.toCharArray();
		System.out.println(characters);
		
		
		for(char character : characters ) {
			Integer isCharExistinMap = occuarance.get(character);
			if(isCharExistinMap == null) {
				occuarance.put(character, 1);
			} else {
				occuarance.put(character, 1 + isCharExistinMap);
			}
		}
		
		
		
		System.out.println(occuarance);
		System.out.println("-----------------------------");
		Map<String, Integer> map = Map.of("A",3,"D",4);
		System.out.println("map:"+map+ "map.get:"+map.get("A") );
		System.out.println(map.size());
		System.out.println(map.isEmpty());
		System.out.println(map.containsKey("A"));
		System.out.println(map.containsValue(3));
		System.out.println(map.keySet());
		System.out.println(map.values());

		Map<String, Integer> hashmap = new HashMap<>(map);
		hashmap.put("C", 10);
		hashmap.put("A", 15);
		System.out.println(hashmap);
		
		LinkedHashMap<String, Integer> lkhmap =  new LinkedHashMap<>(hashmap);
		System.out.println(lkhmap);
		TreeMap<String, Integer> treeMap = new TreeMap<>(lkhmap);
		System.out.println(treeMap);
	}

}
