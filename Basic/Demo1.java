import java.io.*;
class First
{
	int a,m;
	void initl()
	{
		a = 10; m = 20;
	}
	void display()
	{
		System.out.println("a & m "+a +" "+ m);
	}
}

class Demo1
{
	public static void main(String[] args)
	{
		First obj1 = new First();
		First obj2;
		obj1.initl();
		obj1.display();
	}
}