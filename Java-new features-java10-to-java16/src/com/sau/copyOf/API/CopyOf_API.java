package com.sau.copyOf.API;

import java.util.ArrayList;
import java.util.List;

public class CopyOf_API {

	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();
		list.add("java");
		list.add("python");
		list.add("c++");
		
		List<String> list1 = List.copyOf(list);
		// List.copyOf(listObj) make the list immutable so the we can not change list after that 
		// it will give error
		
		//list1.add("c#"); // give error
		
	
	}

}
