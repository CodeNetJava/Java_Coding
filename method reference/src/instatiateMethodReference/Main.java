package instatiateMethodReference;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


public class Main {

	public  int compareByName(Person a, Person b){
		return a.getName().compareTo(b.getName());}
		
		public  Integer compareByAge(Person a, Person b) {
			return a.getAge().compareTo(b.getAge());}

		public static void main(String[] args) {
			List<Person> list1 = new ArrayList<Person>();
			list1.add(new Person("savita", 23));
			list1.add(new Person("engineer", 25));
			list1.add(new Person("Business Women", 26));
			
			Main obj = new Main();
			Collections.sort(list1, obj::compareByName);
			list1.forEach(System.out::println);
			
			System.out.println("************************");
			
	        Collections.sort(list1,new Main()::compareByAge);
			list1.forEach(System.out::println);
		}}
