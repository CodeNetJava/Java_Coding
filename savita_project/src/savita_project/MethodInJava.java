package savita_project;

public class MethodInJava {

	public static void main(String[] args) {
	
		
		int score = CalculateHighScorePosition(1500 );
		DisplayHighScorePosition( "savita" , score );
		    
		 score = CalculateHighScorePosition( 900 );   
		DisplayHighScorePosition( "savita" , score );
		
		 score = CalculateHighScorePosition( 400 );
		DisplayHighScorePosition( "savita" , score );
		
		score = CalculateHighScorePosition( 50 );
		DisplayHighScorePosition( "savita" , score );
		 
	}
	
	public static void DisplayHighScorePosition( String PlayerName , int Position )
	{
		System.out.println(PlayerName +
				" managed to get into position " 
				+ Position + 
				" on the high score table");
		
	}
	
	public static int CalculateHighScorePosition( int score)
	
	{
		if (score >= 1000)
			return 1;
		
		else if ( score >= 500 && score < 1000 )
			return 2;
		
		else if ( score >= 100 && score < 500 )
			return 3;
		
		else 
			return 4;
		
	}

}
