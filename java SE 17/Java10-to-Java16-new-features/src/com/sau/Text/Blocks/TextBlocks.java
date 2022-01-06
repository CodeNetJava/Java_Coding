package com.sau.Text.Blocks;

public class TextBlocks {

	public static void main(String[] args) {
		System.out.println("line1\nline2\nline3\nline4"); //this code is quite hard to read
		
		// """     """ textbox make output easily readable
		// we have start form next line after """
		// at last of last line we can add """
		System.out.println("""
				***********************
				line1
				line2
				line3
				line4"""
				);
		
		
		String str = """
				***********************
				name %s
				age  %d
				surname %s
				""".formatted("savita",23,"shinde");
		
		System.out.println(str);
	}

}
