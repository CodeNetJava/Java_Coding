package TCS.DCA;
import java.util.Scanner;
public class Money {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("enter amount");
		int amount = sc.nextInt();
		int count1=0,count2=0,count3=0,count4=0,count5=0;
		
		int array[] = {2000, 1000, 100, 50, 10};
		int length = array.length;
		int count[];
		
	
			for(int i=0 ; i<length ; i++) {
				
				if(i==0) {
					
					while(amount>2000) {
						amount = amount - 2000;
						count1++;
					}
				}
				
	           if(i==1) {
					
					while(amount>1000) {
						amount = amount - 1000;
						count2++;
					}
				}
	           
	           if(i==2) {
					
					while(amount>100) {
						amount = amount - 100;
						count3++;
					}
				}
	           

	           if(i==3) {
					
					while(amount>50) {
						amount = amount - 50;
						count4++;
					}
				}
	           

	           if(i==4) {
					
					while(amount>10) {
						amount = amount - 10;
						count5++;
					}
				}
			}
			
		
		System.out.println("number of 2000 rs notes "+count1);
		System.out.println("number of 1000 rs notes "+count2);
		System.out.println("number of 100 rs notes "+count3);
		System.out.println("number of 50 rs notes "+count4);
		System.out.println("number of 10 rs notes "+count5);
		System.out.println("coins "+amount);
		
	}

}
