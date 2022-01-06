package instanceMethodReference.objectOfparticularType;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Demo {

	public static void main(String[] args) {
		
	ArrayList<String> list = new ArrayList<>(List.of("sau","Director","Business Women"));
	Collections.sort(list, String::compareTo);
	System.out.println(list);
	
	ArrayList<Integer> list1 = new ArrayList<>(List.of(30, 10, 40, 5, 70, 50));
	Collections.sort(list1, Integer::compareTo);
	System.out.println(list1);
	}}
