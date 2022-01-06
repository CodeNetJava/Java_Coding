package array;
import java.util.Scanner;
public class Average {
	
	private static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		
		int[] myIntArray = getInteger(5);
		
		System.out.println("average of array elements = "+getAverage(myIntArray) );
		
	}
	
	public static double getAverage(int[] array)
	{
		int sum = 0;
		for(int i = 0 ; i< array.length ; i++)
		{
			 sum += array[i];
		}
		return (double)sum /array.length;
	}

	public static int[] getInteger(int number)
	{
		int[] array = new int[number];
		for (int i = 0 ; i < array.length ; i++ )
		{
		array[i] = scanner.nextInt();	
		}
		return array;
	}
}
