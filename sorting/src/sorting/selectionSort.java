package sorting;

public class selectionSort {

	public static void main(String[] args) {
		int a[] = {5, 2, -1, 6, 3};
		int n = a.length;
		int small = 0 ;
		int temp = 0;
		
		for(int i = 0 ; i <n ; i++) {
			small = i;
			for(int j = i ; j <n ; j++) {
				if(a[j]<a[small]) {
					small = j;
				}
			}
			temp = a[i];
			a[i] = a[small];
			a[small] = temp;
		}
		for(int e : a) {
			System.out.print(e+" ");
		}
	}

}
