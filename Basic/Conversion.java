import java.io.*;
import java.util.*;
class Conversion
{
	public static void main(String[] arg)
	{
		byte am;
		int i = 275;
		double a = 323.142;

		System.out.println("Conversion of int to byte : ");
		am = (byte) i;
		System.out.println("i and a " +i+ " "+am);

		System.out.println("Conversion of int to byte : ");
		i = (int) a;
		System.out.println("a and i " +a+ " "+i);

		System.out.println("Conversion of int to byte : ");
		am = (byte) a;
		System.out.println("a and am " +a+ " "+am);
		
	}
}