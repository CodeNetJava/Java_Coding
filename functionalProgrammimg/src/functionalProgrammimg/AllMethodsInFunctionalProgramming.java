package functionalProgrammimg;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class AllMethodsInFunctionalProgramming {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		List<Integer> list = List.of(3, 6 ,13, 16, 2, 4, 1);
		List<String> list1 = List.of("Apple", "Bat", "Cat", "Dat");
		
		
		// sorted() -- to sort list elements
		list.stream().sorted().forEach(e -> System.out.println(e));
		System.out.println();
		
		// distinct() -- to unsort the array list elements
		list.stream().distinct().forEach(e -> System.out.println(e));
		System.out.println();
		
		//map()
		list.stream().map(e -> e*e).forEach(e -> System.out.println(e));
		System.out.println();
		
		//print squares of first 10 numbers
		IntStream.range(1, 11).map(e -> e*e).forEach(e -> System.out.println(e));
		System.out.println();
		
		//List.of("Apple", "Bat", "Cat", "Dat")
		//convert all to lowercase
		// toLowerCase();
		list1.stream().map(e -> e.toLowerCase()).forEach(e -> System.out.println(e));
		System.out.println();
		
		//give the length of each word
		list1.stream().map(e -> e.length()).forEach(e -> System.out.println(e));
		System.out.println();
		
		
		// find the largest number in the list
		Integer i = list.stream().max( (n1,n2) -> Integer.compare(n1,n2)).get();
		System.out.println("max number in list "+i);
		System.out.println();
		
		// find the smallest number in the list
		Integer j = list.stream().min( (n1,n2) -> Integer.compare(n1,n2)).get();
		System.out.println("min number in the list "+j);
		
		//convert IntStream to list
		IntStream.range(1, 11).map(e -> e*e).boxed().collect(Collectors.toList()).forEach(e -> System.out.println(e));
		System.out.println();
		
		IntStream.range(1, 11).filter(e -> e%2==0).boxed().collect(Collectors.toList()).forEach(e -> System.out.println(e));
		System.out.println();
		
	}

}
