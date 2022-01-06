package reverseString;

public class stringBufferAndBuilder {

	public static void main(String[] args) {
		String str1 = "savita";
		System.out.println(str1);
		
		// StringBuffer
		System.out.println(stringBufferMethod(str1));
		

		//StringBuilder
		System.out.println(stringBuilderMethod(str1));
		
		
	}

	private static String stringBuilderMethod(String str1) {
		StringBuilder str3 = new StringBuilder(str1);
		str3.reverse();
		return str3.toString();
	}

	private static String stringBufferMethod(String str1) {
		StringBuffer str2 = new StringBuffer(str1);
		str2.reverse();
		return str2.toString();
	}

}
