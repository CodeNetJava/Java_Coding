package tryWithResources;

import java.util.Scanner;

// try(with resources){}
// normally Scanner close code we write it in finally block
// but in try(with resources){} Scanner  will automatically gets close when give scanner object in try(resource) at resource place
// this feature is came in java 7

public class TryWithResources {

	public static void main(String[] args) {
		method2();
		System.out.println("main method called");

	}

	private static void method2() {
		method1();
		System.out.println("method2 called");
	}

	private static void method1() {
		try(Scanner sc = new Scanner(System.in)) {
	    // NullPointerException
		/*String str = null;
		str.length();*/
			
			
			
		// ArrayOutOfBoundException
			int arr[] = {1,2};
			int a = arr[2];
			
		}
		
		catch(ArrayIndexOutOfBoundsException e) {
			e.printStackTrace();
		}
		
		System.out.println("method1 called"); 
	}

}

