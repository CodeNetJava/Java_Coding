package functionalProgrammimg;
import java.util.*;
public class FunctionalProgrammimg {

	public static void main(String[] args) {
		List <String> list =  List.of("Apple", "bat", "cat","mat");
		
		//print List
		list.stream().forEach(elements -> System.out.print(elements+" "));
		System.out.println();
		
		//print with filter
		list.stream().filter(elements -> elements.endsWith("at")).forEach(elements -> System.out.print(elements+" "));
		System.out.println();
	}

}
