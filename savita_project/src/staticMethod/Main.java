package staticMethod;

public class Main {

	public static void main(String[] args) {
		
// for Demo class
		Demo.display1(); //static method can be called by using the class name
	//	Demo.display2();  // to call the non static method need object of the class // this shows error
		
		Demo obj1 = new Demo();
		obj1.display2();
	}
//*******************
	
// for staticBlock class
	
//**********************
}
