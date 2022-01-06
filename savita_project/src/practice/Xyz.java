package practice;
import java.util.Scanner;

public class Xyz {

	public static void main(String[] args) {
		Scanner s = new Scanner (System.in);
		int n = s.nextInt();
		String strSum;
		String str1 = "0", str2 = "1";
		String[] arr = new String [n];
			 System.out.println(str1);
			 System.out.println(str2);
	
			 for(int k = 0 ; k < n ; k++) {
		
		 strSum = str1 + str2;
		System.out.println(strSum);
		arr[k] = strSum;
		str1 = str2;
		str2 = strSum;
	
		}
			 for(int k = n-2 ; k >=0 ; k--) {
				 System.out.println(arr[k]);
			 }
			 System.out.println("1");
			 System.out.println("0");
	}

}
