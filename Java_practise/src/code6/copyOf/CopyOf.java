package code6.copyOf;

import java.util.ArrayList;
import java.util.List;

public class CopyOf {

	public static void main(String[] args) {
		List<Integer> list1 =List.of(10, 50, 30, 20);
		
		List<Integer> list2 = List.copyOf(list1);
		list1.add(90); //give error //can not add elements in the list now
		list2.add(70); //give error //can not add elements in the list now
}}
