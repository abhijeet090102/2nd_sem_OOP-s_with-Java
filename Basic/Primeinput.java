import java.io.*;
import java.util.*;
class Primeinput
{
	public static void main(String[] agrs)
	{
		int n;int c=0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter The no range :");
		n = sc.nextInt();
		for(int i=1;i<=n; i++)
		{
			c = 0;
			for (int j=1;j<=i; j++)
			{
				if (i%j==0)
				{
					c += 1;
				}
			}
		if (c==2)
		{
			System.out.println("The Prime no are "+i);
		}
				
			
		}
	}
}