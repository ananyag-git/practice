package practice;

import java.util.Scanner;

public class H_Sum_DigitNo 
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the no :");
		int num = sc.nextInt();
		int sum = 0;
		while(num>0)
		{
			sum =sum+num%10;
			num= num/10;
		}
		System.out.println("Su of digit "+sum);
		
	}

}
