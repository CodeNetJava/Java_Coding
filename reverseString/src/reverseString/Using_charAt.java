package reverseString;

import java.util.Scanner;

public class Using_charAt {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	    String str1 = sc.next();
	    System.out.println(extracted(str1));
	       
	       

	}

	private static String extracted(String str1) {
		String str2 ="";
	    
	    for(int i = str1.length()-1; i>=0; i--) {
	    	str2 = str2 + str1.charAt(i);
	    }
	    return str2;
	}

}
