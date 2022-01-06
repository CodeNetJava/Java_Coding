package practice;

import java.util.Scanner;

public class removeVowel {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		
		String str = s.nextLine();
		
		str = str.replaceAll("[aeiouAEIOU]", "");
		System.out.print(str);

	}

}
