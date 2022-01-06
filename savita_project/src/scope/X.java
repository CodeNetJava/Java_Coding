package scope;

import java.util.Scanner;

public class X {
	
	private int x;
	
	public X(Scanner x) {
		this.x = x.nextInt();
	}
	
	public void x()
	{
		int x = 2;
		
		System.out.println("method x = "+ x);
		System.out.println("class x = "+ this.x);
		
	}
	
	public class InnerClass {
		int x = 3;
		public void x()
		{
			int x = 3;
			X.this.x();
			System.out.println("method x = "+ x);
			System.out.println("class x = "+ this.x);
			System.out.println("class x = "+ X.this.x);
			
		}
	}

}
