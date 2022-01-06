package com.sau.stream;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class Stream {

	public static void main(String[] args) {
		List<Integer> list = List.of(1,2,3,6,4,9);
		
		//sort elements
		List<Integer> list1 = list.stream().sorted().collect(Collectors.toList());
		System.out.println(list1);
		
		//map()-- is used to do the operation on each element of the list
		// square of each element
		List<Integer> list2 = list.stream().map(e -> e*e).collect(Collectors.toList());
		System.out.println(list2);
		
		//filter()
        //filter even numbers from the list
		List<Integer> list3 = list.stream().filter(e -> e%2 == 0).collect(Collectors.toList());
		System.out.println(list3);
		
		//reduce() 
		//reduce the list to one number sum of all numbers
		//e.g sum of all numbers, large number,small number
		Integer number = list.stream().reduce(0,(e1,e2)-> e1 + e2);
		System.out.println(number);
		
		//largest number
		Integer number1 = list.stream().reduce(0,(e1,e2)-> e1>e2?e1:e2);
		System.out.println(number1);
		
		//smallest number
		Optional<Integer> number2 = list.stream().reduce((e1,e2)-> e1<e2?e1:e2);
		number2.ifPresent(System.out::println);
		
	}

}
