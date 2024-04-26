import java.io.*;
import java.util.*;
abstract class A{
	abstract void show();
	int a = 10;
	int m = 12;
	public void display(){
		System.out.println("The value of a + m is :"+(a+m));
	}
}
class B extends A {
	public void show (){ // override the interface show methode
		System.out.println("Call me from B ");
	}
}
class Abstract_call extends B{
	public static void main(String[] args){
		A r;
		B ob = new B();
		r = ob;	
		ob.show();
	}
}