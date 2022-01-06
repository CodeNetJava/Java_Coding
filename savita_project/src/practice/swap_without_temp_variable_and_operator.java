package practice;
import java.util.Scanner;

// swap_without_temp_variable_and_operator
public class swap_without_temp_variable_and_operator {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int a = s.nextInt();
		int b = s.nextInt();
		System.out.println("a = "+a+" b = "+b);
		
		if(a>b) {
		int quetiont = a/b;
		int remainder = a%b;
		
		int x = b*quetiont + remainder;
		int y = (a-remainder)/ quetiont;
		System.out.println("a = "+y+" b = "+x);
		}
		
		else if(a<b) {
			int quetiont = b/a;
			int remainder = b%a;
			
			int x = a*quetiont + remainder;
			int y = (b-remainder)/ quetiont;
			System.out.println("a = "+x+" b = "+y);
			}
		}
		
	}

