package practice;

import java.util.Scanner;

public class D_PallindromeNo
{
	public static void main(String[] args)
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the no ");
		int num = sc.nextInt();
		int org_num = num;
		int rev = 0;
		while(num!=0)
		{
			rev =rev*10 + num%10;
			num = num/10;
		}
		if(org_num == rev)
		{
			System.out.println("Pallindrom no "+org_num);
		}
		else
		{
			System.out.println("Not pllindrome no "+org_num);
		}
			
		
	}

}
