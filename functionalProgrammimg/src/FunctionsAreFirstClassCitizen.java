import java.util.List;
import java.util.function.Predicate;

public class FunctionsAreFirstClassCitizen {

	public static void main(String[] args) {

        //storing functions in variable
		//passing functions to methods
		//returning functions from methods
		
		//storing functions in variable
		Predicate<? super Integer> predicateVariable =e -> e%2==0;
		List.of(3, 6 ,13, 16, 2, 4, 1).stream().filter(predicateVariable).map(e -> e*e).forEach(e -> System.out.println(e));
		System.out.println();
		
		//passing functions to methods
		List.of(3, 6 ,13, 16, 2, 4, 1).stream().filter(extractedMethod()).map(e -> e*e).forEach(e -> System.out.println(e));
		System.out.println();
		
		//returning functions from methods
		Predicate<? super Integer> predicateVariable1 = extractedMethod();
		List.of(3, 6 ,13, 16, 2, 4, 1).stream().filter(predicateVariable1).map(e -> e*e).forEach(e -> System.out.println(e));
		System.out.println();
		
		}

	    private static Predicate<? super Integer> extractedMethod() {
		return e -> e%2==0;
	    }

}
