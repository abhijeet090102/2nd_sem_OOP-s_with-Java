import java.util.*;
import java.io.*;
class TwoD_Array{
	//int[] [] twoD = new int[4] [4];
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int a,m;
		System.out.println("Enter the array size ");
		a = sc.nextInt();
		m = sc.nextInt();
		int [] [] twoD=new int[a][m];
		int k = 0;
		for(int i=0; i<a; i++){
			for(int j=0; j<m; j++){
				
				twoD[i][j] = k;
				k++;
			}
		}
		System.out.println("Total array values are ");
		for(int j=0; j<4; j++)
		{
			for(int i=0; i<4; i++){
				System.out.print(twoD[j][i]+" ");
			System.out.println();
			}
		}
	}
}