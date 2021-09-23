package practice;

public class M_factorialNo
{
	public static void main(String[] args)
	{
		int n= 5;
		long fact = 1;
		//1.
	/*	for(int i=1; i<=n; i++)
		{
			fact = fact*i;
		}
		System.out.println("Factorial of "+n+ "!= "+fact);   */
		
		
		
		//2.
		for(int i=n; i>=1; i--)
		{
			fact = fact*i;
		}
		System.out.println("Factorial of "+n+ "!= "+fact);
	}

}
