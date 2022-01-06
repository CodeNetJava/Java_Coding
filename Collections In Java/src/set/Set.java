package set;
import java.util.*;
public class Set {

	public static void main(String[] args) {
	
		List<Character> character = List.of('d','b','a','c','e');
		
		HashSet<Character> hashSet = new HashSet<>(character);
		hashSet.forEach(System.out::println);
		System.out.println();
		
		LinkedHashSet <Character> linkedHashSet = new LinkedHashSet<>(character);
		linkedHashSet.forEach(System.out::println);
		System.out.println();
		
		TreeSet <Character> treeSet = new TreeSet<>(character);
		treeSet.forEach(System.out::println);
		System.out.println();
		
		

	}

}
