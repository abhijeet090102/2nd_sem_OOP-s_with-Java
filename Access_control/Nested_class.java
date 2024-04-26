import java.io.*;
import java.util.*;
class nested{
	int out = 20;
	void test(){
		Inner inn = new Inner();
		inn.display();
	}
	class Inner {
		void display(){
			System.out.println("Outer value is : "+out);
		}
	}
}
class Nested_class{
	public static void main(String[] args){
		nested ne = new nested();
		ne.test();
	}
}