package functionalProgrammimg;
import java.util.*;
// assign function value to a variable
public class Sum {

	public static void main(String[] args) {
    int sum =0;
    List <Integer> list = List.of(3, 4, 7, 5);
    sum = list.stream().filter(parameter -> parameter%2==1).reduce(0, (parameter1, parameter2) -> (parameter1 + parameter2));
    System.out.println(sum);

	}

}
