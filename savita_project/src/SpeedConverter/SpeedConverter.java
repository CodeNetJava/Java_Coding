package SpeedConverter;

public class SpeedConverter {
	
	public static long toMilesPerHour(double kiloMetersPerHour) {
		if( kiloMetersPerHour < 0)
		{
			return -1;
		}
		else {
			long milesPerHour = Math.round( kiloMetersPerHour / 1.609 );
			return milesPerHour;
		}
		
	}
		
		public static void printConversion(double kiloMetersPerHour) {
			if( kiloMetersPerHour < 0)
			{
				System.out.println("Invalid Value");
			}
			else {
				System.out.println(kiloMetersPerHour + " km/hr = "+ toMilesPerHour( kiloMetersPerHour ) + " mi/hr");
			}
		}
}
