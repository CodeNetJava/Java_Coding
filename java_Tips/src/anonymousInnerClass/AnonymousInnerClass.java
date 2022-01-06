package anonymousInnerClass;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class AnonymousInnerClass {

	public static void main(String[] args) {
        List<String> animals = new ArrayList<String>(List.of("savita","priyanka","divya"));

    // Collections.sort(animals);
       
        // below we have not created new class for comparator
        //here only we have created comparator class
        // the class has not given any name that class is non as comparator class
        Comparator <String> anonymous = new Comparator <String>() {

			@Override
			public int compare(String str1, String str2) {
				return str1.length()-str2.length();
			}
        	
        };
		Collections.sort(animals, anonymous);
     
     System.out.println(animals);
	}

}
