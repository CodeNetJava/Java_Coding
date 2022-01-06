package reverseString;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class UsingCollection {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str1 = sc.next();
		
		System.out.println(extracted(str1));

	}

	private static String extracted(String str1) {
		String x = "";
		List <Character> list = new ArrayList<>();
		
		for(int i=0; i<str1.length(); i++) {
			list.add(str1.charAt(i));
		}
		Collections.reverse(list);
		
		for(char ch4: list) {
			x+=ch4;
		}
		return x;
		
	}

}
