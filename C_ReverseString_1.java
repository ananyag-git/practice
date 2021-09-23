package practice;

import java.util.Scanner;

public class C_ReverseString_1
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string ");
		String str = sc.nextLine();
		
		//using String concateness operator
		
		//str = "ABCD";
		int len = str.length();
		String rev =" ";
		for(int i = len-1; i>=0; i--)
		{
			rev = rev+str.charAt(i);
		}
		System.out.println(rev);
		
	}

}
