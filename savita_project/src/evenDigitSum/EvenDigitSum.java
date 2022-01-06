package evenDigitSum;

public class EvenDigitSum {
	
	public static int getEvenDigitSum ( int number )
	{
		int sum = 0;
		if( number < 0)
		{
			return -1;
		}
		
		else 
		{
			while( number > 0)
			{
				 int evenNum = number % 10;
				 number = number / 10;
				  if( evenNum % 2 == 0)
				  {
					  sum += evenNum;
				  }
			}
			return sum ;
		}
	}

}
