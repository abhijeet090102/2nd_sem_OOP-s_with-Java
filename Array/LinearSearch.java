import java.io.*;
import java.util.*;
class LinearSearch {
	public static int linearSearch (int[] list , int item) {
		
		for (int j= 0; j<list.length; j++){
			if (list[j]== item){
				return j;
			}
		
		}
		return -1;
	}  
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
		int result = linearSearch(list,item);
		if (result != -1){	
			System.out.println(item + " Found at " +result);
		}
		else{
			System.out.println(item +" Not Found ");
		} 
	}
}
