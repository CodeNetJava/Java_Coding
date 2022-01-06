package TCS.DCA;
import java.util.Scanner;

public class AirCraftDirection {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String s = sc.nextLine();
		 char []array= s.toCharArray();
		 int N=0,S=0,W=0,E=0;
		 
		 for(char ch : array) {
			 if(ch == 'N') {
				 N++;
			 }
			 else if(ch == 'S') {
				 S++;
			 }
			 else if(ch == 'W') {
				 W++;
			 }
			 else {
				E++;
			 }
		 }
		
		 if((N == S) && (W == E ))
			 System.out.println("Returned successfully");
		 
		 else
			 System.out.println("Not returned successfully");
	}

}
