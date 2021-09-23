package practice;

import java.util.Scanner;

public class B_ReversrNum_3 
{
	public static void main(String[] args)
	{
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter the number : ");
		int num = sc.nextInt();
		
		//usng stringBuilder
		StringBuilder sbl = new StringBuilder();
		 sbl.append(num);
		 StringBuilder rev = sbl.reverse();
		 System.out.println(rev);
		
	}

}
