package staticMethod;

public class staticBlock {
	static int a;
	
	// static block can initialize static variables
	// static block executes when class is created // executes static block first and main method after 
	//static blocks are used to initialise variables nd native methods are used in static block
	static {
		 a=0 ;    
		 System.out.println("static block");
	}
	
	public static void main(String[] args) {
		System.out.println("main method");
	}
	
	static {
		 a=0 ;    
		 System.out.println("static block 2");
	}
}
