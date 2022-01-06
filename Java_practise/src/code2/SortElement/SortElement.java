package code2.SortElement;

import java.util.Arrays;

public class SortElement {



	public static void main(String[] args) {
		System.out.println(Arrays.toString(extracted()));

	}

	private static int [] extracted() {
		int arr[] = {20, 50, 30,29,77,33,98};
		int temp = 0;
		for(int i = 0; i < arr.length-1; i++) {
			for(int j =0 ; j <arr.length-1; j++ ) {
				 if(arr[i]<arr[j])
				 {
					 temp = arr[j];
					 arr[j]=arr[i];
					 arr[i]=temp;
				 }
			}
		}
		
		return arr;
	}

}
