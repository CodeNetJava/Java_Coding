package practice;

import java.util.Scanner;

public class fibboLogic {

	public static void main(String[] args) {
		Scanner s = new Scanner (System.in);
		int n = s.nextInt();
		int strSum;
		int num1 = 0, num2 = 1;
	    int i,j,k;
	     
	    for( i = 1 ; i <=n/2 ; i++) {
			
		for( j = n/2 ; j >= i ; j--) {
			System.out.print(" ");
	   
		 }
			 
		for( k = 1 ; k <=i ; k++) {
			if(k==1&&i==1) {
				System.out.print(0+" ");
			}
			else if(k==2&&i==2) {
				System.out.print(1+" ");
			}
			else {
		strSum = num1 + num2;
		System.out.print(strSum+" ");
		num1 = num2;
		num2 = strSum;
			}
		}
		System.out.println();
	 }
	    
	    //lower
	    for( i = n/2 ; i >=1 ; i--) {
			
			for( j = (n/2)+1 ; j >= i ; j--) {
				System.out.print(" ");
		   
			 }
				 
			for( k = 1 ; k <i ; k++) {
			strSum = num1 + num2;
			System.out.print(strSum+" ");
			num1 = num2;
			num2 = strSum;
			}
			System.out.println();
		 }
	}

}
