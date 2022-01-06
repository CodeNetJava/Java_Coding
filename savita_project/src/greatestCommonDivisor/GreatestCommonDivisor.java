package greatestCommonDivisor;

public class GreatestCommonDivisor {
	public static int getGreatestCommonDivisor ( int first , int second )
	{
		int i;
		if( first < 10 || second < 10 )
		{
			return -1;
		}
		
		else 
		{ 
			
			int temp1 = first;
			int temp2 = second;
			
			for ( i = temp1 ; i > 0; i--)
			{
			  if( temp1 % i == 0 )
			  {
			     if (temp2 % i == 0)
					  {
						 break;
					  }
				  }
				  
			  }
			return i;
			}
		}
	}

