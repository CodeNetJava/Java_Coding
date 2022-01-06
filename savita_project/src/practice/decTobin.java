package practice;
import java.util.Scanner;

public class decTobin {
	
	static void convert(int n)
    {
        int[] binary = new int[1000];
   
        int i = 0;
        while (n > 0) 
        {
            
        	binary[i] = n % 2;
            n = n / 2;
            i++;
        }
        for (int j = i - 1; j >= 0; j--)
            System.out.print(binary[j]);
    }

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int[] a= new int[4];
		
		for(int i = 0 ; i <4 ; i++) 
		{
		a[i] = s.nextInt();
		}
		
		for(int j = 0 ; j <4 ; j++) 
		{
			convert(a[j]);
			System.out.println();
		}

	}

}
