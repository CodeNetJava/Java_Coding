package sorting;

public class BubbleSort {

	public static void main(String[] args) {
		
		int a[] = {2,1,8,-3,6,4,12};
		
		method1(a);
		method2(a);
		method3(a);
		
	}
	
	public static void method1(int a[]) {
		int n = a.length;
		int temp = 0;
		for(int j = 0 ; j< n-1 ; j++) {
		for(int i = 0; i < n-1 ; i ++)
		{
			if(a[i]>a[i+1])
			{
				temp = a[i];
				a[i]=a[i+1];
				a[i+1]=temp;
			}
		}
	}
		for (int item: a)
		{
			System.out.print(item+" ");
		}
		
		System.out.println();
	}
	
	// at the last we will get largest element in every iteration 
	//so array is sorting from last element so we can reduce length by 1 every time
		public static void method2(int a[]) {
			int n = a.length;
			int temp = 0;
			for(int j = 0 ; j< n-1 ; j++) {
			for(int i = 0; i < (n-1)-1 ; i ++)
			{
				if(a[i]>a[i+1])
				{
					temp = a[i];
					a[i]=a[i+1];
					a[i+1]=temp;
				}
			}
		}
			for (int item: a)
			{
				System.out.print(item+" ");
			}
			
			System.out.println();
	}
		
		// sometimes array get sorted after 1-2 iteration only so need to sort upto n-1 times 
		// so keep check for whether array is sorted or not
		
		public static void method3(int a[]) {
			int n = a.length;
			boolean sorted = true;
			int temp = 0;
			for(int j = 0 ; j< n-1 ; j++) {
			for(int i = 0; i < (n-1)-1 ; i ++)
			{
				if(a[i]>a[i+1])
				{
					temp = a[i];
					a[i]=a[i+1];
					a[i+1]=temp;
					sorted = false;
				}
			}
			if(sorted) break;
		}
			for (int item: a)
			{
				System.out.print(item+" ");
			}
			
			System.out.println();
	}
	}

