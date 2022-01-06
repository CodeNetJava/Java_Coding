package reverseString;

import java.util.Scanner;

public class toCharArray {

	public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       
       String str1 = sc.next();
       
       System.out.println(extracted(str1));

	}

	private static String extracted(String str1) {
		 char arr1[] = str1.toCharArray();
		String reverseString ="";
		   
		   for(int i = str1.length()-1 ; i >= 0 ; i--) { 
			   reverseString = reverseString + arr1[i];
		   }
		   return reverseString;
	}

}
