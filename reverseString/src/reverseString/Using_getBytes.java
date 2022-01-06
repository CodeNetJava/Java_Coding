package reverseString;

import java.util.Scanner;

public class Using_getBytes {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		String str1 = sc.next();
		
        System.out.println(reverse(str1));

	}

	private static String reverse(String str1) {
		byte byteArray[] = str1.getBytes();
		byte bytearr2[] = new byte[str1.length()];
		
		for(int i = 0 ; i<str1.length() ; i++) {
			bytearr2[i] = byteArray[(str1.length()-1) - i];
		}
		
		String str3 = new String(bytearr2);
		return str3;
		
	}

}
