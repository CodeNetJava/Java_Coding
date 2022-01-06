package staticMethod;

public class Demo {
	//static method can be called by using the class name
	static void display1 () {
	  	  System.out.println("1");
	    }
	// to call the non static method need object of the class // this shows error
   void display2 () {
	  	  System.out.println("2");
	    }
}
