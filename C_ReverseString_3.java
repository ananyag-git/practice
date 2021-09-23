package practice;

import java.util.Scanner;

public class C_ReverseString_3
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string ");
		String str = sc.nextLine();
		
		//using StrngBuffer
		
		//str = "ABCD";
		StringBuffer sb = new StringBuffer(str);
		System.out.println("Rev String : "+sb.reverse());
		
	}

}
