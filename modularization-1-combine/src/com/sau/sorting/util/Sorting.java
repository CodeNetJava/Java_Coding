package com.sau.sorting.util;

import java.util.List;

import com.sau.sorting.algorithm.BubbleSort;

public class Sorting {
		
		public List<String> sort(List<String> names){
		BubbleSort bubbleSort = new BubbleSort();
		
		return bubbleSort.sort(names);
		
		}
}
