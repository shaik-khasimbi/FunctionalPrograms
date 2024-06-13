package com.example.demo.functional;

import java.util.List;
import java.util.function.BinaryOperator;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

public class EP03 {

	@SuppressWarnings("unused")
	public static void main(String[] args) {
		
		List<Integer> numbers  = List.of(12,8,4,7,5,10,4,2,3,4);
		Predicate<Integer> predicate = x-> x%2 ==0;
		Predicate<Integer> predicate1 = new Predicate<Integer>() {
			
			@Override
			public boolean test(Integer t) {
				return t%2 ==0;
			}
		};
		
		Function<Integer, Integer> mapper = x->x*x;
		
		Function<Integer, Integer> mapper1 = new Function<Integer, Integer>() {
			
			@Override
			public Integer apply(Integer t) {
				return t*t;
			}
		};
		
		Consumer<Integer> action = System.out::print;
		
		Consumer<Integer> action1 = new Consumer<Integer>() {
			
			@Override
			public void accept(Integer t) {
				System.out.println(t);
			}
		};
		numbers.stream().filter(predicate1).map(mapper1).forEach(action1);
		
		BinaryOperator<Integer> accumulator = Integer::sum;
		
		BinaryOperator<Integer> accumulator1 = new BinaryOperator<Integer>() {
			
			@Override
			public Integer apply(Integer t, Integer u) {
				return t + u;
			}
		};
		
		
		int sum = numbers.stream().distinct().sorted().reduce(0, accumulator1);
		System.out.println(sum);

	}

}
