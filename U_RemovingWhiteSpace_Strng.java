package practice;

public class U_RemovingWhiteSpace_Strng
{
	public static void main(String[] args)
	{
		String str = "Java Programming Selenium Automation";
		System.out.println("Before replacing white space "+str);
		
		str = str.replaceAll("\\s","");
		//str = str.replaceAll("\\s"," ");      //this is not replacing space
		System.out.println("After replacing white space "+str);
		
	}

}
