package hashTable;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.LongAdder;
import java.util.*;


public class HashtableRunner {

	public static void main(String[] args) {
		String str = "savita kerba shinde";
		ConcurrentHashMap<Character, LongAdder> table = new ConcurrentHashMap<>();
		
		for(char character:str.toCharArray()) {
			table.computeIfAbsent(character, e -> new LongAdder()).increment();
			
			LongAdder longAdder = table.get(character);
			if(longAdder == null) {
				longAdder = new LongAdder();
			}
			else { 
				longAdder.increment();
				table.put(character, longAdder);
			}
		}
		
		System.out.println(table);
	}


}
