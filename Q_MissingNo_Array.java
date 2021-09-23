package practice;

public class Q_MissingNo_Array
{
	public static void main(String[] args)
	{
		//Array shoud nit have duplicate
		//Array no usrd to sorted order
		//value should bein range
		
		int a[] = {1,2,4,5};
		int sum1 =0;
		for(int i=0; i<a.length; i++)
		{
			sum1 = sum1 + a[i];
		}
		System.out.println("Sum of given array :"+sum1);
		int sum2 =0;
		for(int i=1; i<=5;i++)
		{
			sum2 = sum2 + i;
		}
		System.out.println("Sum of range : "+sum2);
		
		System.out.println("Missing no in array : "+(sum2-sum1));
	}

}
