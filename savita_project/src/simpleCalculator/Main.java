package simpleCalculator;

public class Main {

	public static void main(String[] args) {
		
		SimpleCalculator obj1  = new SimpleCalculator();
		obj1.setFirstNumber(1.1);
		obj1.setSecondNumber( 2.2);
		
		System.out.println("addition = "+obj1.getAdditionResult());
		System.out.println("substraction = "+obj1.getSubtractionResult());
		System.out.println("multiplication = "+obj1.getMultiplicationResult());
		System.out.println("division = "+obj1.getDivisionResult());
	}

}
