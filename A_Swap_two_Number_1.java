package practice;

public class A_Swap_two_Number_1
{
	public static void main(String[] args)
	{
		int a=10;
		int b= 20;
		System.out.println("Before swapping value are  "+a+ " "+b);
		//using third variable
		
		int t=a;
		a=b;
		b=t;
		System.out.println("After swapping "+a+" "+b);
	}

}
