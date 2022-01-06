package practice;

import java.util.Scanner;

public class StarPatterns {
	
	public static void triangle(int rowNum) {
		System.out.println("pattern1");
		for(int i = 1 ; i<=rowNum ; i++)
		{
			for(int j = 1 ; j<=i ; j++) {
			System.out.print("*");
			}
			System.out.println();
		}
	}
	
  public static void triangle2(int rowNum) {
		   System.out.println("pattern2");
		   for(int i = 1 ; i<=rowNum ; i++)
			{
			   for(int j = i  ; j<rowNum ; j++) {
					System.out.print(" ");
					}
			   for(int j = 1  ; j<=i ; j++) {
					System.out.print("*");
					}
			   System.out.println();
			}
		}
	   
   public static void triangleReverse(int rowNum) {
	   System.out.println("pattern3");
	   for(int i = 1 ; i<=rowNum ; i++)
		{
		   for(int j = i  ; j<= rowNum ; j++) {
				System.out.print("*");
				}
		   System.out.println();
		}
	}
   
   
   public static void triangleReverse2(int rowNum) {
	   System.out.println("pattern4");
	   for(int i = 1 ; i<=rowNum ; i++)
		{
		   for(int j =1 ; j <i; j++) {
				System.out.print(" ");
				}
		   for(int j = i ; j<=rowNum ; j++) {
				System.out.print("*");
				}
		   System.out.println();
		}
	}
   
   public static void pattern5(int rowNum) {
	   System.out.println("pattern5");
	   for(int i = 1 ; i<=rowNum ; i++)
		{
		   for(int j =i ; j <=rowNum; j++) {
				System.out.print(" ");
				}
		   for(int j = 1 ; j<i ; j++) {
				System.out.print("*");
				}
		   for(int j = 1 ; j<=i ; j++) {
				System.out.print("*");
				}
		   System.out.println();
		}
	}
   
   public static void pattern6(int rowNum) {
	   System.out.println("pattern6");
	   for(int i = 1 ; i <= rowNum ; i++)
		{
		   for(int j = 1; j <= i ; j++) {
		   System.out.print(" ");
		   }
		   
		   for(int j = i ; j < rowNum ; j ++ ) {
				System.out.print("*");
				}
		   
		   for(int j = i ; j <= rowNum ; j++) {
			   System.out.print("*");
		   }
		   
		   System.out.println();
		}
	}
   
   public static void pattern7(int rowNum) {
	   System.out.println("pattern7");
	  for(int i = 1 ; i < rowNum ; i++) {
		  for( int j = i ; j <= rowNum ; j++)
		  {
			  System.out.print(" ");
		  }
		  for(int j = 1 ; j < i ; j++)
		  {
			  System.out.print("*");
		  }
		  for(int j = 1 ; j <= i ; j++)
		  {
			  System.out.print("*");
		  }
		  
		  System.out.println();
	  }
	  
	  for(int i = 1 ; i <= rowNum ; i++) {
		  for( int j = 1 ; j <= i ; j++)
		  {
			  System.out.print(" ");
		  }
		  for(int j = i ; j < rowNum ; j++)
		  {
			  System.out.print("*");
		  }
		  for(int j = i ; j <= rowNum ; j++)
		  {
			  System.out.print("*");
		  }
		  
		  System.out.println();
	  }
	}
   
   public static void pattern8(int rowNum) {
	   System.out.println("pattern8");
	  for(int i = 1 ; i < rowNum ; i++) {
		  for( int j = 1 ; j <= i ; j++)
		  {
			  System.out.print("*");
		  }
		  System.out.println();
	     }
	  for(int i = 1 ; i <= rowNum ; i++)
		  {
			 
		  for(int j = i ; j <= rowNum ; j++)
		  {
			  System.out.print("*");
		  }
		  System.out.println();
		  }
		 
	  }
	  
   public static void pattern9(int rowNum) {
	   System.out.println("pattern9");
	   for(int i = 1 ; i<rowNum ; i++)
		{
		   for(int j = i ; j <=rowNum ; j ++) {
				System.out.print(" ");
				}
		   for(int j = 1 ; j <=i ; j ++ ) {
				System.out.print("*");
				}
		   System.out.println();
		}
	   for(int i = 1 ; i<=rowNum ; i++)
		{
		   for(int j = 1 ; j <=i ; j ++) {
				System.out.print(" ");
				}
		   for(int j = i ; j <= rowNum ; j ++ ) {
				System.out.print("*");
				}
		   System.out.println();
		}
	}
   
   

	public static void main(String[] args) {
		
		Scanner s = new Scanner (System.in);
		int rowNum = s.nextInt();
		
		//triangle
		triangle(rowNum);
		
		//triangle2
		triangle2(rowNum);
				
		//triangleReverse
		triangleReverse(rowNum);
		
		//triangleReverse2
		triangleReverse2(rowNum);
		
		//pattern5
		pattern5(rowNum);
		
		//pattern6
		pattern6(rowNum);
		
		//pattern7
		pattern7(rowNum);
		
		//pattern8
		pattern8(rowNum);
		
		//pattern9
		pattern9(rowNum);
		
		//pattern10
		//pattern10(rowNum);
	}

}
