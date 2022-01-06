package practice;
import java.util.Scanner;

public class reverse_string {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		
		String str = s.nextLine();
		
		for(int i=str.length(); i>0 ; i--)
		{
			char ch = str.charAt(i-1);
			System.out.print(ch);
		}

	}

}
