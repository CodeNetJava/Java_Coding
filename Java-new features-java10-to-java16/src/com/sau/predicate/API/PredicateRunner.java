package com.sau.predicate.API;

import java.util.List;
import java.util.function.Predicate;

public class PredicateRunner {

	public static void main(String[] args) {
		List <Integer> list = List.of(1,6,8,3,8,5);
		
		/*
		Predicate<Integer> predicate = e -> e%2 ==0;
		
		list.stream().filter(predicate).forEachOrdered(System.out::println); // even number
		list.stream().filter(predicate.negate()).forEachOrdered(System.out::println); // odd number
		*/
		
		list.stream().filter(PredicateRunner::isEven).forEachOrdered(System.out::println); // even number
		list.stream().filter(Predicate.not(PredicateRunner::isEven)).forEachOrdered(System.out::println); // odd number
	}
	
	public static boolean isEven(Integer num) {
		return num%2 == 0;
	}

}
