package minimumElement;
import java.util.Scanner;
public class MinimumElement {

	public static int readInteger() {
	
	Scanner scanner = new Scanner(System.in);
	int NoOfElements = scanner.nextInt();
	return NoOfElements;
	
	}
	public static int[] readElements( int NoOfElements ) {
		Scanner scanner = new Scanner(System.in);
		int [] array = new int[NoOfElements];
		for(int i = 0 ; i < array.length ; i++ )
		{
			array[i] = scanner.nextInt();
		}
		return array;
	}
	
	public static int findMin(int [] array) {
		int min=0;
		
		for(int j = 0 ; j < array.length ; j++) {
		for(int i = j+1 ; i < array.length ; i++ )
		{
			if(array[j]>array[i]) {
				min=array[j];
			array[j]= array[i];
			array[i]=min;
			}
		}
	}
		return array[0];
	}
}
