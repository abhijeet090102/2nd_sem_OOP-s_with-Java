import java.io.*;
import java.math.*;
interface square{
	static int a = 4;
	static int m = 6;
	static public double ts = Math.sqrt(a);
	static public double ma = Math.sqrt(m);
	public void show(); // by default it is public and abstract method
}
interface addition extends square{
	static double am = 6;
	static double st = 8;
	public void show2(); 
// interface does not support method defination 
}
// implements the interfaces 
class math implements addition{
	void show2(){
		System.out.println("The addition of two numbers "+(am+st));
	}
	void show(){
		System.out.println("The square of two numbers are : "+ts+ " and "+ma);
	}
}
class Interface {
	public static void main (String[] args){
		math ma = new math();
		ma.show();
		ma.show2();
	}


}