package autoboxingUnboxing;
import java.util.ArrayList;

public class AutoboxingUnboxing {

	public static void main(String[] args) {
		int[] intArray = new int[8];
		String [] stringArr = new String[9];
		
		ArrayList<String> stringArrList = new ArrayList<String>();
	//  ArrayList<int> intArrList = new ArrayList<int>(); //this is giving error because integer is primitive type can't create list for primitive type

		ArrayList<Integer> intArrList = new ArrayList<Integer>();
		ArrayList<Double> doubleArrList = new ArrayList<Double>();
		
		Integer a = 22;
		int b = a;
		// Autoboxing
		
		for(int i = 0 ; i < 10; i ++) {
			intArrList.add(i);  
			//intArrList.add(Integer.valueOf(i));
		}
		
		// Unboxing 
		
		for(int i = 0 ; i < 10; i ++) {
			System.out.println(intArrList.get(i));
			//System.out.println(intArrList.get(i).intValue());
		}
		
		for(double dbl=0.0; dbl<10.0; dbl += 0.5) {
			doubleArrList.add(dbl);  
			//intArrList.add(Integer.valueOf(i));
		}
		
		// Unboxing 
		
		for(int i = 0 ; i < doubleArrList.size(); i ++) {
			System.out.println(doubleArrList.get(i));
			//System.out.println(intArrList.get(i).intValue());
		}
	}

}
