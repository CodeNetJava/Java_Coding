package importAndStaticImport;

//java.lang package is by default imported no need to import
import java.lang.Math;
import java.lang.System;

// static imports are used to access static members of the class
import static java.lang.Math.*;
import static java.lang.System.*;
public class ImportAndStaticImport {

	public static void main(String[] args) {
		
		// by using import
		System.out.println(Math.sqrt(4));
		
		//by using static import
		out.println(sqrt(4)); // no need to mention class names

	}

}
