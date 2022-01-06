package com.sau.consumer;

import java.util.List;
import java.util.logging.Logger;

import com.sau.sorting.util.Sorting;



public class ConsumerMain {

	public static void main(String[] args) {
      Logger logger = Logger.getLogger(ConsumerMain.class.getName());
		Sorting util = new Sorting();
		List <String> list = util.sort(List.of("math", "science","java"));
		//System.out.println(list);
		
		logger.info(list.toString());
	}

}
