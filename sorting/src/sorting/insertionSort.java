package sorting;

public class insertionSort {

	public static void main(String[] args) {
		int a[] = {8, 4, 1, 5, 9, 2};
		int n = a.length;
		int j = 0 ;
		int temp = 0;
		for(int i = 1 ; i < n ; i ++) {
			temp = a[i];
			
			for( j = i ; j >0 && a[j-1]>temp ; j--) {
				
				a[j] = a[j-1];
			}
			a[j]=temp;
		}
		
		for(int e: a) {
			System.out.print(e+" ");
		}

	}

}
