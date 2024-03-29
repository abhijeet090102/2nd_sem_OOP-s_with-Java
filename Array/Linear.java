import java.io.*;
import java.util.*;
class LinearSearch {
	public static void main(String[] args){
		Scanner am = new Scanner(System.in);
		System.out.println ("Enter the size of the array ");
		int st = am.nextInt();
		int[] list = new int[st];
		for (int i=0; i<list.length; i++){
			System.out.println ("Enter the array values ");
			list[i] = am.nextInt();
		}
	
		int item = am.nextInt();
		for (int j= 0; j<list.length; j++){
			if (item == list[j]){
				//System.out.println(" The item is matched at"+j);
				//break;
				
			}
		else{
			System.out.println("The item is not matched ");
		}
		//return 0;
		} 
		  
	}
}
