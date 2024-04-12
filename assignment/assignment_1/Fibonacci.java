import java.io.*;
import java.util.*;
class fibo{
	void fibonum(int am){
      	int m=0,a=1;
      	int tota = 0;
      	int sum =0;
      	for (int i=1; i<am; i++){	
			sum = m +a;
            System.out.println("The "+i+" fibonacci is "+a);
            m = a;
			a = sum;
		tota += m;
        	}
      	
      	System.out.println("The total sum value of fibonacci is "+tota);
        
    	}
}
class Fibonacci{
	public static void main(String[] args) {
      	Scanner st = new Scanner(System.in);
		System.out.print("Enter the number you want value: ");
      	int a = st.nextInt();
      	fibo ob = new fibo();
      	ob.fibonum(a);
		
    }
}