import java.io.*;
import java.util.*;
class CommaLoop{
	public static void main(String[] args){
		int a,m;
		a = 1;
		boolean done = false;
		for (m= 4,a=1; a<m; a++,m--){
			System.out.println("a = "+a);
			System.out.println("m = "+m);
			
		}
		for ( ; !done;){
			System.out.println("a is " +a);
			if (a==10) done = true;
			a++;
		}
	}
}