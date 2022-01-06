package minutesToYearsAndDaysCalculator;

public class MinutesToYearsAndDaysCalculator {

	public static void main(String[] args) {
		printYearsAndDays(525600);

	}
	
	public static void printYearsAndDays( long minutes ) {
		if(minutes < 0) {
			System.out.println("Invalid Value");
		}
		else {
			long years = (( minutes /60)/24);
			long year = years/365;
			long days = years % 365;
			System.out.println(minutes + " min = " + year + " y and " + days + " d");
			
		}
	}

}
