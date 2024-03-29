import java.io.*;
import java.util.*;
class Quadri{
	double l,b;
	Quadri(){
		Scanner am = new Scanner(System.in);
		int st = am.nextInt();
		l = b= st;
		System.out.println("No equal formed ");
	}
	Quadri(double am){
		l = b = am;
		System.out.println("A square ");
	}
	Quadri(Quadri quad){
		this.l = quad.l;
		this.b = quad.b;
		System.out.println("clone created behaving like rectangle ");
	}
	void area(){
		System.out.println("Area of the figure "+l*b);
	}
}
class Quadrilateral{
	public static void main(String[] args){
		Quadri ob = new Quadri();
		Quadri ob1 = new Quadri(20);
		Quadri ob2 = new Quadri(ob1);
		ob.area();
	}
}