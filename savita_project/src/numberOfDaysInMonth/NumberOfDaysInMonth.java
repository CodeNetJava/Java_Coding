package numberOfDaysInMonth;

public class NumberOfDaysInMonth {
	
	public static boolean isLeapYear ( int year ) {
		 if( year <= 0 || year >= 9999)
		 {
			 return false;
		 }
		 else
		 {
			 int a = year % 4;
			 int b = year % 4;
			 int c = year % 4;
			 
			 if( a == 0 && b == 0 && c == 0) {
				 return true;
			}
			
			else if(a == 0 && b != 0) {
				return true;
			}
			
			else {
				return false;
			}
		 }
	}
	
	public static int getDaysInMonth ( int month , int year ) {
		 if(( month < 1 && month > 12) || ( year < 1 && year > 9999 )){
			 return -1;
		 }
		 else
		 {
			 boolean y1 = isLeapYear( year );
			 
			 if ( y1 == true ) 
			 {

				 if(month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12)
				 {
					 return 31; 
				 }
				 else if(month == 2)
				 {
					 return 29;
				 }
				 else
				 {
					 return 30;
				 }
			 }
		
			 else 
			 {
				 if(month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12)
				 {
					 return 31; 
				 }
				 else if(month == 2)
				 {
					 return 29;
				 }
				 else// if(month == 4 || month == 6 || month == 9 || month == 11 )
				 {
					 return 30;
				 }
			 }
		 }
	}
}


