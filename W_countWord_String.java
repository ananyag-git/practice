package practice;

public class W_countWord_String
{
	public static void main(String[] args)
	{
		String str = "Welcome to java selenium";  //4 words
		int count =1;
		for(int i=0; i<str.length()-1; i++)
		{
			if((str.charAt(i)==' ') && (str.charAt(i+1)!=' '))
			{
				count++;
			}
		}
		System.out.println("No of word in string : "+count);
		
	}
		
	

}
