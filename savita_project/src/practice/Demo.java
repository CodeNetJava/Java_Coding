package practice;

import java.util.Scanner;

public class Demo {
	
	public static void giveChar(String s1)
	{
		int count = 0;
        char arr [] =new  char[s1.length()];
		
		int n = s1.length();
		
		for(int j=0 ; j<s1.length();j++)
		{
			arr [j] =s1.charAt(j);
		}
		
		for(int i = 0;i<n;i++)
		{
		for(int j=i+1 ; j<n;j++)
		{
			if(arr [i] == arr [j]) {
				break;
			}
			if(j == (n-1) )
			{
				if(arr [i] != arr [j])
				{
					count++;
				}
			}
			
		}
		if(count == 2)
		{
			System.out.println(arr[i]);
			break;
		}
	
		}
			
	}

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String s1 = s.nextLine();
		
		giveChar(s1);
		//abbcdefgabbcdabcg
	}

}
