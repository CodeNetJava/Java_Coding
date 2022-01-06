package practice;
import java.util.Scanner;
// swapping two variables
public class swapping {
	
	public static void swap(int a, int b) {
		int t;
		t = a;
		a = b;
		b = t;
		System.out.println("a = "+a+" b = "+b);
	}

	

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		int a = s.nextInt();
		int b = s.nextInt();
		System.out.println("a = "+a+" b = "+b);
		swap(a,b);
		
	}

}
