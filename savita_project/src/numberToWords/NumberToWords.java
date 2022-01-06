package numberToWords;

public class NumberToWords {
	
	 public static void numberToWords ( int number )
	 {
		 int c = getDigitCount(number);
		 int num = reverse(number);
		 int n;
		 int c2 = getDigitCount(num);
//		 System.out.println(c);
//		 System.out.println(c2);
		 if ( num < 0)
		 {
			 System.out.println("Invalid Value");
		 }
		 else 
		 {
			do
			 {
			     n = num % 10;
			    num = num / 10;
			     
			   
			    switch ( n )
			    {
			    case 0:
			    	System.out.println("Zero");
			    	break;
			    case 1:
			    	System.out.println("One");
			    	break;
			    case 2:
			    	System.out.println("Two");
			    	break;
			    case 3:
			    	System.out.println("Three");
			    	break;
			    case 4:
			    	System.out.println("Four");
			    	break;
			    case 5:
			    	System.out.println("Five");
			    	break;
			    case 6:
			    	System.out.println("Six");
			    	break;
			    case 7:
			    	System.out.println("Seven");
			    	break;
			    case 8:
			    	System.out.println("Eight");
			    	break;
			    case 9:
			    	System.out.println("Nine");
			    	break;
			    }
			  	   
			 }while(num>0);
			 
			
			 if(c-c2 == 0)
			 {
				 
			 }
			 else
				 {
				 for(int j=0; j < (c - c2) ; j++ )
				   
				 {
					 System.out.println("Zero");
				 }
			   }
		 }
			 
		 }
	 
	 
	 public static int reverse ( int number ) 
	 {
		 int reverse = 0;
		 
		 while(number != 0)
		 {
		    int n = number % 10;
		    number = number / 10;
		    reverse= reverse*10 + n;
		 }
		  
		 return reverse;
		 
	 }
	 
	 public static int getDigitCount ( int number ) 
	 {
		 int count = 0;
		 
		 if(number <0)
		 {
			 return -1;
		 }
		 
		do
		 {
		    number = number / 10;
		    count++;
		 } while(number > 0);
		  
		 return count;
		 
	 }

}
