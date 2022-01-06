package largestPrime;

public class LargestPrime {
	public static int getLargestPrime( int number )
	{
		if(number <= 1)
		{
			return -1;
		}
		int temp = number ;
		
		int temp2 = 0 ;
		for ( int i = temp; i>1 ; i--)
		{
			boolean prime = false;
			if ( temp % i == 0)
			{
				 temp2 = i;
				for( int j = 2 ; j <= temp2/2 ; j++)
				{
					if( temp2 % j == 0)
					{
						prime = true;
						break;
					}
					
				}
				
				if( !prime)
				{
				break;
				}
				
			}
		}
	
			return temp2;
		
	}

}
