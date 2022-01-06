package hashMapClass;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class HashMapClass {
	
	public static void find()
	{
		String str = "abcbde";
		char a[] = str.toCharArray();
		HashMap<Character,Integer> map = new HashMap<Character,Integer> ();
		
		for(Character ch:a) {
			if(map.containsKey(ch)) {
				map.put(ch, map.get(ch)+1);
//				System.out.println(ch);
//				break;
			}
			
			else {
				map.put(ch, 1);
			}
		}
		
		// to print all the values
		Iterator<Character> i = map.keySet().iterator();
		 while(i.hasNext()) {
			 System.out.println(i.next());
		 }
		
		
		
		// to print all the keys
		Collection<Integer> i1 = map.values();
		for(Integer ch : i1) {
		   System.out.println(ch);
		}
		
		
		
	}

	public static void main(String[] args) {
		HashMapClass.find();
	}

}
