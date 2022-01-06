package listInterface;

import java.util.ArrayList;
import java.util.List;

public class ArrayListClass {

	public static void main(String[] args) {
		
		// 3 ways to take list
		// 1st no data type
		ArrayList list1 = new ArrayList();
		// 2nd mention data type
		ArrayList<Integer> list2 = new ArrayList();
		ArrayList<Integer> list3 = new ArrayList<Integer>();
		//dont use List interface
		List list4 = new ArrayList();
		
		// add elements in the list 
		list1.add(00);
		
	    list1.add(10);
	    list1.add(20);
	    list1.add(3, 30);
	    list1.add(40);
	    list1.add(5,50);
	    list1.add(2, 88); // adding at thet place and shifting the previous elements
	    
	    System.out.println(list1);
	    
	    // remote element by index
	    list1.remove(4);
	   // list1.remove(50); //getting error
	    System.out.println(list1);
	    
	    // set elements by index
	    list1.set(3, 99);
	    System.out.println(list1);
	    

	}

}
