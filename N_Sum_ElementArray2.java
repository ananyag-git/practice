package practice;

import java.util.Scanner;

public class N_Sum_ElementArray2
{
	public static void main(String[] args)
	{
		int a[] = {5,2,7,4,6};
		int sum = 0;
		
		//2.
		for(int value :a)
		{
			sum = sum +value;
		}
		System.out.println("Sum of element is :"+sum);
		
	}

}
