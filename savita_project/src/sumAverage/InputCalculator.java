package sumAverage;

import java.util.Scanner;

public class InputCalculator {
	
	public static void inputThenPrintSumAndAverage()
	{
		int sum = 0;
		double average = 0; 
		int count = 0;
		Scanner scanner = new Scanner(System.in);
		
		
		do
		{
			
			boolean val = scanner.hasNextInt();
			if(val)
			{
				int number = scanner.nextInt();
				count++;
				sum += number;
				scanner.nextLine();
			}
			else
			{
				average = (double)sum / count;
				//System.out.println(average);
				long avg = (long) Math.round(average);
				//System.out.println(avg);
				System.out.println("SUM = " +sum+ " AVG = "+avg);
				break;
			}
			
		}while(true);
	scanner.close();
	}

}
