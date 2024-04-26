/* Write a program to create a class Student2 along with two method getData(),printData() 
to get the value through argument and display the data in printData. Create the two 
objects s1 ,s2 to declare and access the values from class STtest.*/
import java.io.*;
import java.util.*;
class Student2{
	
		int roll_no ;
		String name_st ;
		int marks ;
		Scanner am = new Scanner(System.in);
		void getData(){
			System.out.println("Enter the roll no : ");
			roll_no = am.nextInt();
			System.out.println("Enter the name ");
			name_st = am.next();
			System.out.println("Enter the marks ");
			marks = am.nextInt();
		}
		void printData(){
			System.out.println("Student  roll no is "+roll_no+" name is "+name_st+" marks is "+marks);
		}
	
}
class STtest{
	public static void main(String[] args){
		Student2 s1 = new Student2();
		s1.getData();
		Student2 s2 = new Student2();
		s2.getData();
		s1.printData();
		s2.printData();
	}
}