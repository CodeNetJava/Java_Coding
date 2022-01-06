package savita_project;

public class ContinueBreakUse {

	public static void main(String[] args) {
		
		WithContinueBreak();
		WithoutContinueBreak ();
		
	}
	
	public static void WithContinueBreak()
	{
		
		/*with continue and break*/
		int number = 0;
		System.out.println(" with continue and break " );
		
		while( number < 15)
		{
			number ++;
			if( number <= 5)
			{
				//System.out.println(" iiiiiiii " );
				System.out.println( " code before continue " +number );  // 1,2,3,4,5
				continue;
			}
			
		 //System.out.println(" ********* " );	
		 System.out.println(" code after continue " +number );  // 6,7,8,9,10
		    
		   if( number >= 10)
		   {
			   //System.out.println(" ######## " );
			   System.out.println( " code before break " +number ); // 10
			   break;
		   }
		 
		}
		}
		/*without continue and break*/
		
		public static void WithoutContinueBreak ( )
		{
			
		int number = 0;
		System.out.println(" without continue and break " );
		
		while( number < 15)
		{
			number ++;
			if( number <= 5)
			{
				//System.out.println(" iiiiiiii " );
				System.out.println( " code before continue " +number );  // 1,2,3,4,5
				//continue;
			}
			
		// System.out.println(" ********* " );	
		 System.out.println(" code after continue " +number );  // 1,2,3,4,5,  6,7,8,9,  10,11,12,13,14,15
		    
		   if( number >= 10)
		   {
			  // System.out.println(" ######## " );
			   System.out.println( " code before break " +number ); // 10,11,12,13,14,15
			  // break;
		   }
	
		}
		}
}
