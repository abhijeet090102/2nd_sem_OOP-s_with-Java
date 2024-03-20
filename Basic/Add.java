import java.io.*;
import java.util.*;
class Add
{
	public static void main(String[] args)
	{
		int a,m,sum;
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the first value:");
		a = sc.nextInt();
		
		System.out.print("Enter the second value :");
		m = sc.nextInt();
		sum = a+m;
		System.out.println("The "+a+"+"+m+"equal "+sum);
	}
}