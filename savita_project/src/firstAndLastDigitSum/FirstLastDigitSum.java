package firstAndLastDigitSum;

public class FirstLastDigitSum {
	
	public static int sumFirstAndLastDigit ( int number )
	{
		int count = 0;
		int digit = 0;
		int sum = 0;
		int firstDigit = 0;
		if( number <= 0)
		{
			return -1;
		}
		else { 
			while( number > 0)
			{
				digit = number % 10;
				number = number / 10;
				count++;
				if (count == 1)
				{
					 firstDigit = digit;
				}
					
			}
			
			 int lastDigit = digit;
			 sum = firstDigit + lastDigit;
			 return sum;
		}
	}

}
