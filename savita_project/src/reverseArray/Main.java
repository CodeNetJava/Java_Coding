package reverseArray;
import java.util.Arrays;
public class Main {

	public static void main(String[] args) {
		int [] array = {51,84,34,72,1};
		//System.out.println(Arrays.toString(array));
		//System.out.println(Arrays.toString(reverse(array)));
		reverse(array);
	}
	
	public static void reverse(int[] array) {
		System.out.println(Arrays.toString(array));
		int [] reverseArray = new int[array.length];
		int j = 0;
		for(int i = array.length-1; i >= 0 ; i--) {
			while(j<array.length) {
			reverseArray[j]=array[i];
			j++;
			break;
			}
			//return reverseArray;
		}
		System.out.println(Arrays.toString(reverseArray));
	}

}
