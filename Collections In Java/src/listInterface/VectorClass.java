package listInterface;

import java.util.List;
import java.util.Vector;

public class VectorClass {

	public static void main(String[] args) {
		
		// 3 ways to take list
		// 1st no data type
		List vector1 = new Vector();
		// 2nd mention data type
		List<Integer> vector2 = new Vector();
		List<Integer> vector = new Vector<Integer>();
		//dont use List interface
		Vector vector4 = new Vector();
		
		// add elements in the list 
		vector1.add(00);
		
		vector1.add(10);
		vector1.add(20);
		vector1.add(3, 30);
		vector1.add(40);
		vector1.add(5,50);
	    vector1.add(2, 88); // adding at thet place and shifting the previous elements
	    
	    System.out.println(vector1);
	    
	    // remote element by index
	    vector1.remove(4);
	  //  list1.remove(50); //getting error
	    System.out.println(vector1);
	    
	    // set elements by index
	    vector1.set(3, 99);
	    System.out.println(vector1);
	    

	}

}
