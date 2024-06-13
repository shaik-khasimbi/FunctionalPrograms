package com.example.demo.test;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class DuplicateStringinList {

	public static void main(String[] args) {
		
		List<Integer> list  = List.of(12,8,7,4,5,10,4,5,8,4,5,7,2,3);
		
				System.out.println(list.stream().collect(Collectors.groupingBy(n->n, Collectors.counting()))
				.entrySet().stream().filter(e->e.getValue()>1).map(Map.Entry::getKey).skip(1)
				.collect(Collectors.toList()));
		//System.out.println(map);
		// list.stream().filter(n->map.get(n) > 1).collect(Collectors.toList()).forEach(System.out::println);
				System.out.println(IntStream.range(0, list.size()).anyMatch(i->IntStream.range(i+1, list.size()).anyMatch(j-> list.get(i)+list.get(j) ==7)));
				
		
				
				
		
	}

}
