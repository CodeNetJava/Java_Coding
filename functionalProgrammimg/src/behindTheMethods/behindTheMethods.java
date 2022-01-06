package behindTheMethods;

import java.util.*;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

class PredicateInterfaceForFilter implements Predicate<Integer>{

	@Override
	public boolean test(Integer num) {
		return num%2 == 0;
	}

}

class ConsumerInterfaceForforEach implements Consumer<Integer>{

	@Override
	public void accept(Integer t) {
		System.out.println(t);
		
	}
	
}

class FunctionnterfaceForMap implements Function<Integer, Integer>{

	@Override
	public Integer apply(Integer t) {
		
		return t*t;
	}
	
}

public class behindTheMethods {

	public static void main(String[] args) {
		
		List<Integer> list = List.of(3, 6 ,13, 16, 2, 4, 1);
		
		list.stream().filter(e -> e%2==0).map(e -> e*e).forEach(e -> System.out.println(e));
		System.out.println();
		
		//behind our implemented method for filter()
		//Stream<T> filter(Predicate<? super T> predicate);
		//public interface Predicate<T>
		//boolean test(T t);
		list.stream().filter(new PredicateInterfaceForFilter()).forEach(e -> System.out.println(e));
		System.out.println();
		
		//behind our implemented method for forEach()
		//void forEach(Consumer<? super T> action);
		//public interface Consumer<T>
		//void accept(T t);
		list.stream().filter(new PredicateInterfaceForFilter()).forEach( new ConsumerInterfaceForforEach());
		System.out.println();
		
		//behind our implemented method for forEach()
		//<R> Stream<R> map(Function<? super T, ? extends R> mapper);
		//public interface Function<T, R>
		//R apply(T t);
		list.stream().filter(new PredicateInterfaceForFilter()).map(new FunctionnterfaceForMap()).forEach( new ConsumerInterfaceForforEach());
		System.out.println();

	}

}
