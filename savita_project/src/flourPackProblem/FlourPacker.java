package flourPackProblem;

public class FlourPacker {
	
	public static boolean canPack ( int bigCount , int smallCount , int goal)
	{
		int big = 5*bigCount;
		
		if ( bigCount < 0 || smallCount < 0 || goal < 0)
		{
			return false;
		}
		
		if (big > goal)
		{
		    int x = (big - goal);
		    
		    if(x >= 5){
			return true;
		    }
		    else{
		    	int y = goal % 5; 
		        if( smallCount >= y)
		        {
		            return true;
		        }
		        else {
			return false;
		        }
			}
		}
		else if(big  == goal)
		{
			return true;
		}
		else if(big < goal)
		{
			int  g = goal - big;
			if ( smallCount >= g )
			{
				return true;
			}
			else
			{
				return false;
			}
		}
		else
		{
			return false;
		}
		
	} 

}
