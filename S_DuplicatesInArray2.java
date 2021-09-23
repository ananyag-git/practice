package practice;

import java.util.HashSet;

public class S_DuplicatesInArray2
{
	public static void main(String[] args)
	{
		String arr[] = {"java","c++","python","java"};
		
		//using hashSet
		
		HashSet<String> lang=new HashSet();
		
		boolean flag=false;
		
		for(String l:arr)
		{
			if(lang.add(l) == false)
			{
				System.out.println("Found duplicate element : "+l);
				flag = true;
			}
		}
		if(flag = false)
		{
			System.out.println("No duplicate element found");
		}

	}

}
