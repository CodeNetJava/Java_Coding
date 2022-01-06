package com.sau.variable.reference.var;

import java.util.List;
// var instead of data types
public class VariableReferenceVar {

	public static void main(String[] args) {
		List <String> list1 = List.of("java","c++","python","c");
		var list2 = List.of("java","c++","python","c");
		
		var list3 = List.of(list1,list2);
		System.out.println(list3);

	}

}
