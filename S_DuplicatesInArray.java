package practice;

public class S_DuplicatesInArray
{
	public static void main(String[] args)
	{
		String arr[] = {"java","c++","python","java"};
		boolean flag = false;
		for(int i=0; i<arr.length; i++)
		{
			for(int j= i+1; j<arr.length; j++)
			{
				if(arr[i] == arr[j])
				{
					System.out.println("Found duplicate element : "+arr[i]);
					flag = true;
				}
			}
		}
		if(flag == false)
		{
			System.out.println("No duplicate element found");
		}
	}

}
