import java.io.*;
import java.util.*;
class VarDemo{
	public static void main(String[] args){
		var avg =10.0;
		System.out.println("Value of avg: "+avg);
		
		int var = 1; // var is simply a user-defined identifier.
		System.out.println("Value of var: "+var);
		var k = -var;
		System.out.println("Value of k: "+k);

		var ma = new int[16];
		ma[0]=10;
		ma[1]= 0;
		ma[2]=2;
		ma[3]=16;
		ma[4]=9;
		for(int i=0; i<16; i++){
			System.out.println(ma[i]);
		}
	}
}