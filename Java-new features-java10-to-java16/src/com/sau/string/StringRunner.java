package com.sau.string;

import java.util.List;

public class StringRunner {

	public static void main(String[] args) {
		System.out.println(" ".isBlank()); // if only space is there tell string is empty as true
		System.out.println(" SKS ".strip()); // remove spaces from start and end of the string
		System.out.println(" SKS ".stripLeading()); // remove spaces from start
		System.out.println(" SKS ".stripTrailing()); // remove spaces from end
		System.out.println(" SKS ".strip().replace(" ", "#"));
		
		System.out.println("savita".transform(e -> e.substring(2)));
		//System.out.println("my name is %s my age is %d".formatted("savita",23));
		
		

	}

}
