package practice;

import java.util.Scanner;

public class G_EvenOddNoCount
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the no :");
		int num = sc.nextInt();
		int even_odd =0;
		int odd_even =0;
		while(num>0)
		{
			int num1 =num%10;
			if(num%2 ==0)
			{
				even_odd++;
			}
			else
			{
				odd_even++;
			}
			num= num/10;
		}
		System.out.println("even no count "+even_odd);
		System.out.println("odd no count "+odd_even);
		
	}

}
