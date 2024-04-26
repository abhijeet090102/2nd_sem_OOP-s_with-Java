// Write a java program to print all natural prime numbers up to the given prime number.
import java.io.*;
import java.util.*;
import java.math.*;
class Prime {
	Prime(){
		Scanner am = new Scanner(System.in);
		System.out.print("Enter the no upto you want prime: ");
		int st = am.nextInt();
		double a;
		for (int i=1; i<=st; i++){
				a = Math.sqrt(i);
				boolean isPrim = true;
				for (int j = 2; j<=a; j++){
					if (i%j==0){
						isPrim = false;
						break;
					}
				}
				if (i==1){
					System.out.println(i+"is nor prime nor composite");
				}
				else if (isPrim && i>1) {
					System.out.println("The prime no is  "+ i);
				}
			
		}
	}

	public static void main(String[] args){
		Prime obj = new Prime();
		
	}
}
