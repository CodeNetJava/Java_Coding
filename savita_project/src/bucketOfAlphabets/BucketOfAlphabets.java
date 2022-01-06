package bucketOfAlphabets;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class BucketOfAlphabets {

	public static void main(String[] args) {
		 Scanner Scan = new Scanner(System.in);

	     String Str1 = Scan.next();
	     String str2 = Str1.replaceAll(",", "");
	     
	     int n = Scan.nextInt();
	     
	     String[] stringArr = new String[n];
	     Scan.nextLine();
	     for(int i = 0 ; i < n ; i++) {
	    	 stringArr[i]= Scan.nextLine();
	    	
	     }
	     
	     
	     for(int j = 0 ; j < stringArr.length ; j++) {
	    	if( containsAllChars(str2,stringArr[j]))
	    		System.out.println("YES");
	    	
	    	else
	    		System.out.println("NO");
	     }
	     

	    }

	public static Set<Character> stringToCharacterSet(String s) {
	    Set<Character> set = new HashSet<>();
	    for (char c : s.toCharArray()) {
	        set.add(c);
	    }
	    return set;
	}

	public static boolean containsAllChars
	    (String container, String containee) {
	    return stringToCharacterSet(container).containsAll
	               (stringToCharacterSet(containee));
	}
	}

