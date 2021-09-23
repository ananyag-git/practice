package practice;

public class A_Swap_two_Number_5
{
	public static void main(String[] args)
	{
	int a=10;
	int b=20;
	System.out.println("Before swapping value are  "+a+ " "+b);
	//using single statement
	
	b=a+b -(a=b);
	System.out.println("After swapping "+a+" "+b);
	}

}
