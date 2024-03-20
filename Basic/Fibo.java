import java.io.*;
import java.util.*;
class Fibo
{
	public static void main(String[] args)
	{
		int am;int m=1;int a=1; int total=0,sum =0;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the no range:");
		
		am = sc.nextInt();
		System.out.println("Fibo"+m);
		System.out.println("Fibo"+a);
		for(int i=2; i<=am-1;i++)
		{
			total = a+m;
			a = m;
			m = total;
			System.out.println("Fibo"+i+" series "+total);
			//System.out.println(total);
			sum = total+sum;
		}
	
	System.out.println(sum+2);
	}
}