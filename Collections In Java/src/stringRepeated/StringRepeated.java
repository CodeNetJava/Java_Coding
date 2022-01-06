package stringRepeated;

import java.util.HashMap;

public class StringRepeated {

	public static void main(String[] args) {
		String str = "savita you can do it you have to do it";
		HashMap<String , Integer> hashMap = new HashMap <>();
		
		String array [] = str.split(" ");
		
		for(String arrayElement : array) {
			
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
