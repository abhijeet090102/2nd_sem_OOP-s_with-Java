import java.io.*;
class Emap{
	int id = 1;
	String name = "Abhijeet";
	void display(){
	
		System.out.println("The emp id is "+id +" Name is "+name);
	} 
}
class Emp{
	public static void main(String[] args){
		Emap am = new Emap();
		am.display();
	}
}