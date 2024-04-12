//Write a java program to print sum of n terms in the series 1/1! +1/2!+1/3!.....
import java.io.*;
import java.util.*;
class SumSeries{
	
	double sum;
	SumSeries(int num){
		for (int i = 1; i<=num; i++){
			sum += 1.0/fact(i);
		}
	System.out.println("the factorial of "+num+" sum is :"+sum);
	}
	static int fact(int num){
		if(num ==0){
			return 1;
		}
		else{
			return num *fact(num-1);
		}
	}
	public static void main(String[] args){
		
		Scanner am = new Scanner(System.in);
		System.out.print("Enter the number you want sum of factorial : ");
		int num = am.nextInt();
		SumSeries obj = new SumSeries(num);
	}
}