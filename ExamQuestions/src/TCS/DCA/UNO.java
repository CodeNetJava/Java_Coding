package TCS.DCA;
import java.util.Scanner;
public class UNO {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		
		int number = extracted(a);
		while(number > 9)
		{
			number = extracted(number);
		}
		
		if(number == 1) {
			System.out.println("UNO");
		}
		else
			System.out.println("NOT UNO");
	}

	private static int extracted(int a) {
		int sum = 0;
		while(a>0) {
			int x = a%10;
			a=a/10;
			sum = sum + x;
		}
		return sum;
	}

}
