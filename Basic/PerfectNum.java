import java.io.*;
import java.util.*;

class Perfect
{	void Perfect(){
	int a, sum = 0;
	Scanner sc=new Scanner(System.in);
	a=sc.nextInt();
	for (int i=1; i<a; i++){
		if (a%i==0){
			sum = sum+ i;
		}
	}
	if (sum == a){
		System.out.println("The no is perfect no");
	}
	else{
		System.out.println("The no is not perfect no");
	}
	}
}
class PerfectNum{
	public static void main(String[] args){
		Perfect ob = new Perfect();
		ob.Perfect();
	}
}