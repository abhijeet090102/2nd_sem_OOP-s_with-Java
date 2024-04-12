// Write a java program to print all natural prime numbers up to the given prime number.
import java.io.*;
import java.util.*;
class Prime {
	Prime(){
		Scanner am = new Scanner(System.in);
		System.out.print("Enter the no upto you want prime: ");
		int st = am.nextInt();
		
		for (int i=1; i<=st; i++){
			int count =0;
			for (int j = 2; j<=i/2; j++){
				if (i%j==0){
					count ++;
				}
			}
			if (count==0)
			{
				System.out.println("The prime no is  "+i);
			}
			//System.out.println("The prime no is "+i);
		}
	}
	public static void main(String[] args){
		Prime obj = new Prime();
		
	}
}
