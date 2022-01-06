package com.sau.consumer;

import java.util.List;
import java.util.logging.Logger;

import com.sau.sorting.algorithm.BubbleSort;
import com.sau.sorting.util.Sorting;



public class DirectConsumer {

	public static void main(String[] args) {
      Logger logger = Logger.getLogger(DirectConsumer.class.getName());
		
      BubbleSort util = new BubbleSort();
		List <String> list = util.sort(List.of("math", "science","java"));
		//System.out.println(list);
		
		logger.info(list.toString());
	}

}
