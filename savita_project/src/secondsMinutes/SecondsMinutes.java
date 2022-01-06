package secondsMinutes;

public class SecondsMinutes {
	public static void getDurationString ( int minutes, int seconds )
	{
		if(minutes < 0 || ( seconds < 0 || seconds > 59))
		{
			 System.out.println("Invalid Value");
		}
		else
		{
		int hours = minutes / 60 ;
	    minutes = minutes % 60; 
	     
	    System.out.println(hours + "h " + minutes + "m " + seconds + "s ");
		}
	}
	
	public static void getMinutes (int seconds )
	{
		if(seconds < 0)
		{
			 System.out.println("Invalid Value");
		}
		else {
		int minutes = seconds / 60;
		seconds =  seconds % 60;
		
		getDurationString(minutes , seconds );
		} 
	}
}
