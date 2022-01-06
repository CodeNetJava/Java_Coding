package savita_project;

public class PrimeNumber {

	public static void main(String[] args) {
		
		
		for (int i = 10 ; i <= 50; i++ ) {
			if( PrimeNumber(i) ) {
				System.out.println(i);
			}
		}
		
	}
	
	public static boolean PrimeNumber( int number )
	{
		if(number == 1)
		{
			return false;
		}
		else 
		{
			for( int i = 2 ; i <= number / 2 ; i++ )
			{
				
				if( number % i == 0)
				return false;
			}
			return true;
		}
	}
}