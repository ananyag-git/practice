package practice;

import java.util.Scanner;

public class F_CountNum
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the no : ");
		int numm;
	    int	num = sc.nextInt();
		int count =0;
		while(num>0)
		{
			num = num/10;
			count++;
		}
		System.out.println("No of digit "+count);
		
	}

}
