import java.io.*;
class la_g{
	void la_gr(){
	int[] arr = {20,45,6,59,7,81,23,45,4};
	int largest = arr[0];
	int smallest = arr[0];
	for (int i=1; i<arr.length; i++){
		if (arr[i]<smallest){
			smallest = arr[i];
		}
		else if (arr[i]>largest){
			largest = arr[i];
		}
	}
	System.out.println("The largest element is " + largest);
	System.out.println("The smallest element is " + smallest);
	}
	
}
class Stack{
	public static void main(String[] args){
		la_g ob = new la_g();
		ob.la_gr();
	}
}