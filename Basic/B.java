import java.io.*;
import java.util.*;
class A
{
	int a,m; int sum;
	double addi(int a,int m)
	{
		sum = a+m;
		return sum;
	}
	double sqrtl(int am)
	{
		double num;
		double s = am /2;
		do{
			num = s;
			s = (num + (am/num))/2;
				
		}while ((num -s) != 0);
		return s;
	}
}
class B
{
	public static void main(String[] args)
	{
		A obj = new A();
		System.out.println(obj.addi(2,4));
		A obj1 = new A();
		System.out.println(obj1.sqrtl(16));
	}
}