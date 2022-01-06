package savita_project;

public class SavitaClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Hello world");
		
		/* integer data type */
		
		int a = 5;
		System.out.println("a = "+a);
		
		int b = (1+4)+(6*8);
		System.out.println("b = "+b);
		System.out.println("b = "+(b+1));
		
		int MinValueOfInt = Integer.MIN_VALUE;  // to find minimum value of integer
		int MaxValueOfInt = Integer.MAX_VALUE;  // to find maximum value of integer
		System.out.println("MinValueOfInt = "+MinValueOfInt);
		System.out.println("MaxValueOfInt = "+MaxValueOfInt);
		
		// what will show for the out of range value
		
		System.out.println("MinValueOfInt = "+(MinValueOfInt-1));
		System.out.println("MaxValueOfInt = "+(MaxValueOfInt+1));
		
		//  out of range values
	//	int c = -2147483649;
	//	int d = 2147483648;
		
		
 /* Byte data type */
		
		byte MinValueOfByte = Byte.MIN_VALUE;  // to find minimum value of byte
		byte MaxValueOfByte = Byte.MAX_VALUE;  // to find maximum value of byte
		System.out.println("MinValueOfByte = "+MinValueOfByte);
		System.out.println("MaxValueOfByte = "+MaxValueOfByte);
		
		System.out.println("MinValueOfByte = "+(MinValueOfByte-1));
		System.out.println("MaxValueOfByte = "+(MaxValueOfByte+1));
		
		byte s1 = (byte)(MinValueOfByte/2); //java take MinValueOfByte as an integer value by default
		// so casting is used that is data dyte has mentioned as byte
		System.out.println("s1 = "+s1); 

  /* Short data type */
		
		short MinValueOfShort = Short.MIN_VALUE;  // to find minimum value of short
		short MaxValueOfShort = Short.MAX_VALUE;  // to find maximum value of short
		System.out.println("MinValueOfShort = "+MinValueOfShort);
		System.out.println("MaxValueOfShort = "+MaxValueOfShort);
		
		System.out.println("MinValueOfShort = "+(MinValueOfShort-1));
		System.out.println("MaxValueOfShort = "+(MaxValueOfShort+1));
		
		short s2 = (short)(MinValueOfShort/2); //java take MinValueOfShort as an integer value by default
		// so casting is used that is data dyte has mentioned as short
		System.out.println("s2 = "+s2); 
		
 /* long data type */		
		
		long l1 = 90000L;
		
		System.out.println("l1 = "+l1); 
		
		
/* float data type */
		
		float MinValueOfFloat = Float.MIN_VALUE;  // to find minimum value of float
		float MaxValueOfFloat = Float.MAX_VALUE;  // to find maximum value of float
		System.out.println("MinValueOfFloat = "+MinValueOfFloat);
		System.out.println("MaxValueOfFloat = "+MaxValueOfFloat);
		
	//	float f1 = 6.2; // show error //here java by default take it as double number so do the castsing
		float f1 = (float) 8.9;
		float f2 = 6.2f;
		
		float f3 = 6.7f / 3.7f;
		System.out.println("f3 = "+f3);
		
/* double data type */
		
		double MinValueOfDouble = Double.MIN_VALUE;  // to find minimum value of double
		double MaxValueOfDouble = Double.MAX_VALUE;  // to find maximum value of double
		System.out.println("MinValueOfDouble = "+MinValueOfDouble);
		System.out.println("MaxValueOfDouble = "+MaxValueOfDouble);
		
		double d1 = 7.45;
		double d2 = 99.45d;
		
		double d3 = 7.9d / 9.4d; // double gives more precision values after decimal point than the float
		System.out.println("d3 = "+d3);
		
		double d4 = 3.14756893d;
		double d5 = 3_000_198.5_967_890_890d;
		
		System.out.println(d4);
		System.out.println(d5);
		
		
		
		
	}

}
