package practice;

public class O_EvenOdd_Array2
{
	public static void main(String[] args) 
	{
		int a[] = {1,2,3,4,5,6};
		System.out.println("Even no from array :");
		for(int value :a)
		{
			if(value%2 ==0)
			{
				System.out.println(value);
			}
		}
			System.out.println("Odd no from array :");
			for(int value :a)
			{
				if(value%2 !=0)
				{
					System.out.println(value);
				}
			}
		
		
	}

}
