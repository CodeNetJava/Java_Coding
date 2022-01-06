package array;

public class ArrayType {

	public static void main(String[] args) {
		
		System.out.println("first array");
		int[] intArray1 = new int[5];
		intArray1[0] = 1;
		intArray1[1] = 2;
		intArray1[2] = 3;
		intArray1[3] = 4;
		intArray1[4] = 5;
		
   for (int i = 0 ; i< intArray1.length ; i++ )
  {
	System.out.println(intArray1[i] );
  }

  System.out.println("second array");
  int[] intArray2 = {1,2,3,4,5};  //new int[2];
  
  for (int i = 0 ; i< intArray1.length ; i++ )
  {
  	System.out.println(intArray1[i]+"\r" );
  }
	}

}
