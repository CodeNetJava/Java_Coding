package leapYearCalculator;

public class LeapYear {
	
	public static boolean isLeapYear( int year )
	{
		if ( year < 1 || year > 9999 ){
			return false;
		}
		else {
			int a = year % 4;
			int b = year % 100;
			int c = year % 400;
			
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

}
