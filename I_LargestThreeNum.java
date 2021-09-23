package practice;

import java.util.Scanner;

public class I_LargestThreeNum
{public static void main(String[] args)
{
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter first no :");
	int a=  sc.nextInt();
	System.out.println("Enter thesecond no :");
	int b = sc.nextInt();
	System.out.println("Enter thethird no :");
	int c = sc.nextInt();
/*	if(a>b && a>c)
	{
		System.out.println(a+ " is greater no");
	}
	else if (b>a && b>c)
	{
		System.out.println(b+ " is greater no");
	}
	else
	{
		System.out.println(c+ " is greater no");
	}   */
	
	
	
//using tirnary operator

int largest1= a>b ? a:b;
int largest2 = a>largest1 ? c:largest1;
//int largest = c> (a>b ? a: b) ? (a>b ? a>)
System.out.println(largest2 +" islargest no");
		
}
}
