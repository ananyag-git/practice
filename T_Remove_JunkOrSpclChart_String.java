package practice;

public class T_Remove_JunkOrSpclChart_String
{
	public static void main(String[] args)
	{
		String s = "a?c='%e-$ latin string table 0123456789";
		s= s.replaceAll("[^a-zA-Z0-9]"," ");
		System.out.println(s);
		
		String s1 = "@#$$@ testng #QB$ Selenium !@#%$ 123456";
		s1 = s1.replaceAll("[^a-zA-Z0-9]","");
		System.out.println(s1);
		
	}

}
