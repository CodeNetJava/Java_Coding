package reverseString;

import java.util.Scanner;

public class usingRecursion {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		System.out.println(reverse(str));
	}
	
	public static String reverse(String str) {
		if(str.isEmpty()) {
			return str;
		}
		else {
			String str2;
			str2 = reverse(str.substring(1))+str.charAt(0);
		    return str2;
		}
	}
}
