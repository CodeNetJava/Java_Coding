package scope;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		X x = new X(new Scanner(System.in));
		
		x.x();
		
		System.out.println("*******************");
		 
		X.InnerClass inner = x.new InnerClass();
		inner.x();

	}

}
