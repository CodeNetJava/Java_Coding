package reverseString;

import java.util.Scanner;
import java.util.Stack;

public class UsingStack {

	public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
		
		String str1 = sc.next();
		System.out.println(extracted(str1));
		

	}

	private static String extracted(String str1) {
		Stack<Character> stack = new <Character>Stack();
		
		for(int i=0; i<str1.length();i++) {
			stack.push(str1.charAt(i));
		}
		
		char arr[] = new char[str1.length()];
		
		for(int i=0; i<str1.length();i++) {
			
			arr[i]= stack.pop();
		}
		
//		String reverse= new String(arr);
//		return reverse;
		
		
		return String.copyValueOf(arr);
	}

}
