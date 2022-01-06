package practice;
import java.util.Scanner;

public class GCD {
	
	public static void giveGCD(int a , int b)
	{
		int x = 0;
		int y = 0;
		
		if(a<b) {
		    x = a;
			y = b;
			}
		else {
			x = b;
			y = a;}
		
		for(int i = x; i>0 ; i--)
		{
			if(x%i == 0 && y%i==0)
			{
				System.out.println(i);
				break;
			}
		}
	}

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int a = s.nextInt();
		int b = s.nextInt();
		System.out.println("a = "+a+" b = "+b);
		
		giveGCD(a,b);
	}

}
