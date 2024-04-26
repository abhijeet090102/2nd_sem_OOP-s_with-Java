import java.io.*;
import java.util.*;
class para{
	para(int id , String name){
		System.out.println("Student id is " + id + " and name is "+name); 
	}
}
class Parameterized{
	public static void main(String[] args){
		Scanner am = new Scanner(System.in);
		System.out.println("Enter the id of student ");
		int i = am.nextInt();
		System.out.println("Enter the name of the student ");
		String  st = am.next();
		para obj = new para(i,st);
	}
	
}