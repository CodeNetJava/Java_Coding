package listInterface;

import java.util.Iterator;
import java.util.List;
import java.util.Stack;

public class StackClass {
public static void main(String[] args) {
		
		// 3 ways to take list
		// 1st no data type
	    Stack stack1 = new Stack();
		// 2nd mention data type
		Stack<Integer> stack2 = new Stack();
		Stack<Integer> stack3 = new Stack<Integer>();
		
	
		// push 
		stack2.push(10);
		stack2.push(20);
		stack2.push(30);
		stack2.push(40);
		stack2.push(50);
		
		
		// search method
		System.out.println(stack2.search(20)); // calculate from last as last element is at the top of the stack
		
		//empty method
		System.out.println(stack2.empty());
	    
		//pop
		stack2.pop();
	    System.out.println(stack2);
	    
	    // remote element by index
	    stack2.remove(2);
	  //  list1.remove(50); //getting error
	    System.out.println(stack2);
	    
	    Iterator i1 = stack2.iterator();
	    while(i1.hasNext()) {
	    	System.out.println(i1.next());
	    }

	}

}
