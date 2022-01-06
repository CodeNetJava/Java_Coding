package com.sau.records;

public class RecordsRunner {

	record Person(String name, String email, String phoneNumber) {
		
		// this is known as compact constructor 
		// no need to mention this.name=name; in this constructor
		// mention only validity statements
		Person{
			if(name == null)
			{
				throw new IllegalArgumentException("invalid name");
			}
		}
		
		
		//we can add instatiate methods in record
		public String name() {
			return name;
		}
	}
	
	public static void main(String[] args) {
		
		Person person = new Person("savita","sks","1234");
		Person person1 = new Person("savita","sks","1234");
		Person person2 = new Person("diu","sks","1234");
		System.out.println(person);
		System.out.println(person.phoneNumber());
		
		System.out.println(person.equals(person1));
		System.out.println(person.equals(person2));
		
	}

}
