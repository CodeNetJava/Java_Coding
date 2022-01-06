package savita_project;

public class StringParse {

	public static void main(String[] args) {
		String s1 = "2020";
		System.out.println(s1);
		int i1 = Integer.parseInt(s1);
		 int n = i1 + 1;
		 System.out.println(n);
		 
		// String s2 = "2020a";   // this string is having character also
		//int i2 = Integer.parseInt(s2);  // so gives error while converting to int 
		 //int m = i2 + 1;
		 // System.out.println(m);
		
		String s3 = "2020.123";
		System.out.println(s3);
		double i3 = Double.parseDouble(s3);
		 double o = i3 + 1;
		 System.out.println(o);
	     
	}

}
