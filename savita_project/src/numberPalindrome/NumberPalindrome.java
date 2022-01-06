package numberPalindrome;

public class NumberPalindrome {
	
	public static boolean isPalindrome( int number )
	{
		
		int reverse = 0;
		int temp = number;
		while(temp != 0) 
		{
		int	remainder = temp % 10;
		reverse = reverse*10 + remainder;
		temp = temp / 10;
		}
		
		System.out.println(reverse);
		
		if(reverse == number)
		{
			return true;
		}
		else 
		{
			return false;
		}
	}

}
