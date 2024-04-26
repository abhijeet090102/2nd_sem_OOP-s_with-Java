// Write A Java Program to print Quadratic roots using command line arguments.
import java.io.*;
import java.util.*;
import java.math.*;
class quad{
	quad(double a,double b,double c){
		double root1, root2;
		double d =( (b * b) - 4 *a *c);
		if (d> 0){
			root1 = (-b + Math.sqrt(d))/(2 *a );
			root2 = (-b - Math.sqrt(d))/(2 *a );
			System.out.println("The roots are "+root1 +" and "+root2);
		}
		else if (d == 0){
			root1 = -b /(2*a);
			System.out.println("The root is "+root1);
		}
		else {
			System.out.println("The root are imaginary ");
		}
	}
}
class QuadRoot{
	public static void main(String[] args){
		Scanner am = new Scanner(System.in);
		int a = am.nextInt();
		int b = am.nextInt();
		int c = am.nextInt();
		quad ob = new quad(a,b,c);
		
	}
}