package practice;

public class V_Count_OccurA_Chart_String 
{
	public static void main(String[] args)
	{
		String str = "Java Programming Java Oops";
		//find how many time "a" occur in string
		
		int total_count = str.length();
		int totalCount_afterRemove =str.replaceAll("a","").length();
		int occur =total_count-totalCount_afterRemove;
		System.out.println("No. of occur of a : "+occur);
	}

}
