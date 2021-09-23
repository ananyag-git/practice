package practice;

public class R_MaxMinElement_Array
{
	public static void main(String[] args)
	{
		int a[] = {50,40,100,20,60};
		
		//1.for max
		
		int max = a[0];
		for(int i=1; i<a.length; i++)
		{
			if(a[i]>max)
			{
				max = a[i];
			}
		}
		System.out.println("Max elementin array :  "+max);
		
		
		
		//2.for min
		
		int min = a[0];
		for(int i=1; i<a.length; i++)
		{
			if(a[i]<min)
			{
				min  =a[i];
			}
		}
		System.out.println("Min element in array : "+min);
	}

}
