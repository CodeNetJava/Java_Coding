package exceptionHandling;

//stack trace
//method1
//method2
//main
public class ExceptionHandling {

	public static void main(String[] args) {
		method2();
		System.out.println("main method called");

	}

	private static void method2() {
		method1();
		System.out.println("method2 called");
	}

	private static void method1() {
		try {
	    // NullPointerException
		/*String str = null;
		str.length();*/
			
			
		// ArrayOutOfBoundException
			int arr[] = {1,2};
			int a = arr[2];
			
		}
		
		catch(ArrayIndexOutOfBoundsException e) {
			e.printStackTrace();
		}
		catch(NullPointerException e) {
			e.printStackTrace();
		}
		
		catch(Exception e){
			e.printStackTrace();
		}
		finally {
			System.out.println("important code");
		}
		System.out.println("method1 called"); 
	}

}

//StackTrace
//at exceptionHandling.ExceptionHandling.method1(ExceptionHandling.java:16)
//at exceptionHandling.ExceptionHandling.method2(ExceptionHandling.java:11)
//at exceptionHandling.ExceptionHandling.main(ExceptionHandling.java:6)
