package take.input.from.scanner;

import java.util.Scanner;

public class code {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int i = sc.nextInt();
		sc.nextLine(); // add sc.nextLine() in between//when taking String after integer or double
		String s = sc.nextLine();
		Double d = sc.nextDouble();
		sc.nextLine();
		String s1 = sc.nextLine();
		
		System.out.println(i+"\n"+s+"\n"+d+"\n"+s1);
	}

}
