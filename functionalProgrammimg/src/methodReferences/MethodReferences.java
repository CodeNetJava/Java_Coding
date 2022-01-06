package methodReferences;
import java.util.*;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class MethodReferences {
	
	public static Integer square (Integer num) {
		return num*num;
	}
	
	public static void print(Integer num) {
		System.out.println(num);
	}
	
	public static boolean even(Integer num) {
		return num%2 == 0;
	}


	public static void main(String[] args) {
		
		List.of(3, 6 ,13, 16, 2, 4, 1).stream().filter(e -> e%2==0).map(e -> e*e).forEach(e -> System.out.println(e));
		System.out.println();
		
		//create static methods in the class
		//use method references
		List.of(3, 6 ,13, 16, 2, 4, 1).stream().filter(MethodReferences::even).map(MethodReferences::square).forEach(MethodReferences::print);
		System.out.println();
		
		
		//forEach()
		//normal
		//forEach(e -> System.out.println(e)
		 List.of("Apple", "bat", "cat","mat").stream().map(e -> e.length()).forEach(e -> System.out.println(e));
		 System.out.println();
		//using method reference
		 //class --System.out
		 //method--println
		 //forEach(System.out::println)
		 List.of("Apple", "bat", "cat","mat").stream().map(e -> e.length()).forEach(System.out::println);
		 System.out.println();
		 
		//length()
		//normal
		 List.of("Apple", "bat", "cat","mat").stream().map(e -> e.length()).forEach(e -> System.out.println(e));
		 System.out.println();
		//using method reference
		//class --String
		//method--length
		List.of("Apple", "bat", "cat","mat").stream().map(String::length).forEach(System.out::println);
	    System.out.println();
	  
	}

}
