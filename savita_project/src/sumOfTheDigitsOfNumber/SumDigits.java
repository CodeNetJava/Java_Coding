package sumOfTheDigitsOfNumber;

public class SumDigits {
	
	public static long sumDigits ( long number )
	{
		long sum = 0;
		if( number < 10)
		{
			return -1;
		}
		
			
		while ( number > 0) {
				long m1 = number % 10;
				number = number / 10;
				
				sum += m1;
				
				continue;
				
			} 
			
			return sum;
			
			
    }
	}


