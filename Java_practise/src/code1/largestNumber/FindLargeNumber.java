package code1.largestNumber;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


public class FindLargeNumber {

	public static void main(String[] args) {
		byUsingSwap();
		extracted();
	}

	private static void extracted() {
		ArrayList<Integer> list = new ArrayList(List.of(20, 50, 30,29,77,33,98));
		//List<Integer> list1= List.of(20, 50, 30,29,77,33,98);
		Collections.sort(list);
		System.out.println(list.get(list.size()-1)); //largest
		System.out.println(list.get(list.size()-2)); //second largest
		System.out.println(list.get(0)); //smallest
		var v = list.stream().max((e1,e2)->Integer.compare(e1, e2));
		System.out.println(v);
	}

	private static void byUsingSwap() {
		int arr[] = {20, 50, 30,29,77,33,98};
		int temp = 0;
		for(int i = 0; i < arr.length-1; i++) {
			if(arr[i]>arr[i+1]) {
				 temp = arr[i+1];
				arr[i]=temp;
				arr[i+1]=arr[i];
			}
			//System.out.println(arr[i]);
		}
		System.out.println(arr[arr.length-1]);
//		System.out.println(arr[arr.length-2]);
//		System.out.println(temp);
		System.out.println("***************");
	}
	
}
