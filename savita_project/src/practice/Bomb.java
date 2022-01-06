package practice;
import java.util.Scanner;
public class Bomb {

	public static void main(String[] args) {
		Scanner s = new Scanner (System.in);
		int k;
		int n = s.nextInt();
		int[] array = new int[n];
		 for(int i = 0 ; i < n ; i++) {
			 array[i] = s.nextInt();
		 }
		 for(int i = 0 ; i < n ; i++) {
		 
		 for(int j = 1 ; j < n-i ; j++)
		 {
			if(array[j-1]>array[j]) {
				int temp = array[j-1];
				array[j-1]=array[j];
				array[j] = temp;
			}
			if(j<n-1&&i==0) {
			for(k = 0 ; k < n ; k++) {
				 System.out.print(array[k]+" ");
			}System.out.println();}
			
		 }
		// System.out.println();
		 }
		 for(k = 0 ; k < n ; k++) {
			 System.out.print(array[k]+" ");
		}
	}

}
