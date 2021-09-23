package practice;

public class A_Swap_two_Number_3 
{
	public static void main(String[] args)
	{
		int a=10;
		int b=20;
		System.out.println("Before swapping value are  "+a+ " "+b);
		// use * & / but a & b not should be zero
		a=a*b;
		b=a/b;
		a=a/b;
		System.out.println("After swapping "+a+" "+b);
		
	}

}
