import java.io.*;
abstract class Vehicle{
	int tyre = 4;
	abstract void display();
}
class car extends Vehicle{
	
	public void display(){
		tyre -= 1;
		System.out.println("Car has good engine and tyres has "+tyre);
	}
}
class truck extends Vehicle{
	
	public void display(){
		tyre += 1 ;
		System.out.println("Truck has bad engine and tyres has "+tyre);
	}
}
class Vechile_class {
	public static void main (String[] args ){

		Vehicle ref;
		car ob = new car();
		ref = ob;
		ref.display();
		truck ob1 = new truck();
		ref = ob1;
		ref.display();
	}
}