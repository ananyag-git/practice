package practice;

import java.util.Scanner;

public class E_PallindromeString
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the string :");
		String str = sc.nextLine();
		String org_str = str;
		String rev = "";
		
		
		int len = str.length();
		for(int i=len-1; i>=0; i--)
		{
			rev = rev + str.charAt(i);	
			
			
		}
		
		if(org_str.equals(rev))
		{
			System.out.println("string is pallindrome");
		}
		else
		{
			System.out.println("String is not pallindrome");
		}
		
		
		
		
				
	}

}
