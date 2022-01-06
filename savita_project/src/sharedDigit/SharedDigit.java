package sharedDigit;

public class SharedDigit {
	public static boolean hasSharedDigit( int number1 , int number2 )
	{
		int m1 = 0;
		int m2 = 0;
		if(( number1 < 10 || number1 > 99 ) || ( number2 < 10 || number2 > 99 ))
		{
			return false;
		}
		
		else 
		{
			while ( number1 != 0)
			{
				
				 m1 = number1 % 10;
				number1 = number1 / 10;
				
				int temp = number2;
				
				while (temp != 0)
				{
					 m2 = temp % 10;
					 temp = temp / 10;
					
					if ( m1 == m2)
					{
						break;
						
					}
					
					else
					{
						continue;
					}
				}
				

				if( m1 == m2)
				{
					break;
					
				}
				
				}
			
			if( m1 == m2)
			{
			return true;
			}
			else {
				return false;
			}
		}
	}

}
