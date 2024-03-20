import java.io.*;
import java.util.*;
class Prime
{
	public static void main(String[] args)
	{

		int a;int c = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the no you want to check :");
		a = sc.nextInt();
		for(int i=1;i<=a; i++)
		{
			if (a%i == 0)
			{
				c = c+ 1;
			}
		}
		if (c==2){
			System.out.println("The no "+a+" is prime");
		}
		else {
			System.out.println("The no"+a+" is not Prime");
		}
	}		
}
	