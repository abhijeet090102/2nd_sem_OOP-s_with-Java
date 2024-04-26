import java.io.*;
interface sum{
	public int am = 4; 
	public int st = 8;
	void show();

}
interface Add extends sum{
	void show2(); // invoking the void show2 method from objects
	int sum1 = am +st;
}
class A implements Add{
	public void show(){
		System.out.println("The addition of two number is "+sum1);	
	}
	public void show2(){
		System.out.println("This is inside the Add ");
	}	
}
class A1 extends A{
	public static void main(String[] args){
		A ob = new A();
		ob.show();
		ob.show2();
	}
}