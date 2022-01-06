package practice;

import java.util.Scanner;

public class Day {

	public static void main(String[] args) {
		Scanner sin = new Scanner (System.in);
		int p = sin.nextInt();
		int q = sin.nextInt();
		int s = sin.nextInt();
		int count =0;
		
		for(int i = p ; i <= q ; i++) {
			int reverse = 0;
			int number  = i ;

			while(number!=0)
			{
				int remainder= number% 10;
				reverse = reverse * 10 + remainder;
				number = number/10;
			}
			if((reverse-i)%s==0) {
				count++;
			}
		}
		System.out.print(count);
	}

}
