package com.example.demo.java8;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamApI {

	public static void main(String[] args) {

		List<Integer> list = List.of(1,2,3,4,5,6,7,8,9,10);
		int sum = list.stream().filter(n-> n%2 ==0).mapToInt(n->n*1).sum();
		System.out.println(sum);
		//list.forEach(n->System.out.println(n));
		
		Stream.iterate(1, n->n+1).filter(n->n%5 == 0).limit(4).forEach(System.out::println);
		
		String str = "Hello Ayan How are you baby";
		Map<Character, Integer> mapofStrings = new HashMap<>();
		char[] charater = str.toCharArray();
		
		for(char ch :charater) {
			if(mapofStrings.containsKey(ch)) {
				mapofStrings.put(ch, mapofStrings.get(ch)+1);
			}else {
				mapofStrings.put(ch, 1);
			}
		}
		
		System.out.println(mapofStrings);
		
		Map<String, Long> map = str.codePoints().mapToObj(Character::toString).collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
		System.out.println(map);
		
		short x= 10;
		int value = x*15;
		System.out.println(value);
		
		
		int [] arrays = {1,2,3,4,5};
		
		List <Integer> list1 = Arrays.stream(arrays).boxed().collect(Collectors.toList());
		
		List <Integer> list2 = IntStream.rangeClosed(1, 10).boxed().collect(Collectors.toList());
		
		System.out.println(list1);
		System.out.println(list2);
		
		
		
		/*
		 * Stream.iterate(new int[] {0,1}, x -> new int[]
		 * {x[1],x[0]+x[1]}).limit(n).map(x->x[0]).collect(toList())
		 * .stream().distinct().filter(i->i%2 == 0).mapToInt(i->i).sum();
		 */
	}
	
	

}
