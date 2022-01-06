package lastDigitChecker;

public class LastDigitChecker {
	public static boolean hasSameLastDigit( int number1 , int number2 , int number3 )
	{
		if ( ( number1 < 10 || number1 > 1000) || 
				 ( number2 < 10 || number2 > 1000) ||
				 ( number3 < 10 || number3 > 1000) )
		{
			return false ;
		}
		
		else 
		{
			int m1 = number1 % 10;
			int m2 = number2 % 10;
			int m3 = number3 % 10;
			
			if (( m1 == m2) || ( m3 == m2) ||( m1 == m3) || (( m1 == m2) && ( m3 == m2) &&( m1 == m3)))
			{
				return true ;
			}
		  return false;
		}
	}
	
	public static boolean isValid( int num )
	{
		if ( ( num < 10 || num > 1000) )
				
		{
			return false ;
		}
		else 
			return true;

}
}

