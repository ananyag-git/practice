package practice;

public class O_EvenOdd_Array1
{
	public static void main(String[] args)
	{
		int a[]= {1,2,3,4,5,6};
		
		//1.
		System.out.println("Even no from array :");
		for(int i=0; i<a.length; i++)
		{
			if(a[i]%2 ==0)
			{
				System.out.println(a[i]);
			}
		}
		System.out.println("Odd no from array : ");
		for(int i=0; i<a.length; i++)
		{
			if(a[i]%2 !=0)
			{
				System.out.println(a[i]);
			}
			
		}
		
	}

}
