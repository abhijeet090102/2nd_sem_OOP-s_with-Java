import java.io.*;
import java.util.*;

class mat {

	void add() {
		Scanner am = new Scanner(System.in);
		System.out.println("Enter the size of the array ");
		int st = am.nextInt();
		int[][] arr = new int[st][st];
		int[][] arr1 = new int[st][st];
		
		for (int i=0; i<st; i++){
			for (int j =0; j<st; j++){
				System.out.println(" Enter the value arr ");
				arr[i][j] = am.nextInt();
				System.out.println(" Enter the value of arr1 ");
				arr1[i][j] = am.nextInt();
			}
		}
		
		int sum[][] = new int[arr.length][arr[0].length];
		for (int i=0; i<arr.length; i++){
		    for (int j=0; j<arr[i].length; j++){
			sum[i][j] = arr[i][j] + arr1[i][j];
		    }
		
		}
		
		for (int i=0; i<arr.length; i++){
			for(int j=0; j<arr.length; j++){
				System.out.print(sum[i][j]+" ");
			}
		System.out.println();
		}
		
	}
}
class MatrixAddition{
	public static void main(String[] args){
		mat ob = new mat();
		ob.add();
	}
}