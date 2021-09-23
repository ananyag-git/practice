package practice;

import java.util.Scanner;

public class B_ReversrNum_1
{
	public static void main(String[] args)
	{
		//using algo
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the no ");
		int num = sc.nextInt();
		int rev = 0;
		while(num!=0)
		{
			rev = rev*10 + num%10;
			num = num/10;
		}
		System.out.println("Reverse nuber :"+rev);
		
	}

}
