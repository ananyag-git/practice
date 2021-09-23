package practice;

public class N_Sum_ElementArray1 
{
	public static void main(String[] args)
	{
		int a[] = {5,2,7,4,6};
		int sum = 0;
		
		//1.
		for(int i=0; i<a.length-1; i++)
		{
			sum = sum+ a[i];
		}
		System.out.println("Sum of element is : "+sum);
		
	}

}
