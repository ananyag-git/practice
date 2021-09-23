package practice;

import java.util.Scanner;

public class C_ReverseString_2
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string ");
		String str = sc.nextLine();
		
		//using character array
		
		//str = "ABCD";
		char a[] = str.toCharArray();
		int len = a.length;
		String rev = " ";
		for(int i=len-1; i>=0; i--)
		{
			rev = rev + a[i];
		}
		System.out.println(rev);
		
	}

}
