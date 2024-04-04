import java.io.*;
import java.util.*;
class A{
	int a = 6;
	int m = 4;
}
interface ST{
	int st = 4;

}
class M extends A implements ST{
	int am = 2;
	M(){	
		
		System.out.println("The sum value of a is : "+a +" and m is "+m+" am is"+am);
		System.out.println("The interface variable value is :"+st);
		
	}
}
class AM{
	public static void main(String[] args){
		M ob = new M();
	}
}