package wordRepeted;

import java.util.*;

public class CharRepeted {

	public static void main(String[] args) {
		String str = "savita you can do it you have to do it";
		HashMap<Character , Integer> hashMap = new HashMap <>();
		
		char array [] = str.toCharArray();
		
		for(char arrayElement : array) {
			
			Integer count = hashMap.get(arrayElement);
			
			if(count==null) {
				hashMap.put(arrayElement, 1);
			}
			else
				{hashMap.put(arrayElement, count+1);}
		}
		System.out.println(hashMap);
	}

}
