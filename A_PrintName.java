package practice;

import java.util.Scanner;

public class A_PrintName
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the name :");
		String name = sc.nextLine();
		
		String s = "i";
		
		//print your name without using any loop
		
		s = s.replaceAll("i", "iiiiiiiiii"); //10
		s= s.replaceAll("i","iiiiiiiiii");  //10*10 = 100
		s=s.replaceAll("i","iiiiiiiiii");   //100*10 =1000
		
		s=s.replaceAll("i",name+"\n");
		
		System.out.println(s);
		
	}

}
