import java.io.*;
import java.util.*;
class St
{	
	int a=0;int m=1; int st;
	int swap(int am)
	{	st = am%10;
		while (am >=5){
			
			am /= 10;
			int digit1 = am % 10;
			am /= 10;
            	int digit2 = am % 10;
		
            // Swap the digits and update the result
           	a += m*10* digit1;
		a += m* digit2;
		m *= 10;
		}
		a = (a*10)+st; 

		return a;
	}
}

class Swap
{
	public static void main(String[] args)
	{
		St obj = new St(); 
		System.out.println(obj.swap(5638));
	}
}