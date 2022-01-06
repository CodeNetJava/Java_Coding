package concurrentHashMap;

import java.util.Map;
import java.util.*;


public class ConcurrentHashtableRunner {

	public static void main(String[] args) {
		String str = "savita kerba shinde";
		Hashtable<Character, Integer> table = new Hashtable<>();
		
		char[] arr = str.toCharArray();
		Integer i = 0;
		for(char character:arr) {
			i = table.get(character);
			if(i == null) {
				table.put(character, 1);
			}
			else {
				i++;
				table.put(character, i);
			}
		}
		
		System.out.println(table);
	}

}
