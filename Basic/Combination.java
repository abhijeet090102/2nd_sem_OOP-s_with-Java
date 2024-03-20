import java.io.*;
import java.util.*;
class CombinationNew{
	int a,m,st;
	public void combination(){
		
		Scanner sc= new Scanner(System.in);
		
		a = sc.nextInt();
		m = sc.nextInt();
		st = sc.nextInt();
		for (int i=0; i<=3; i++){
			for(int j=i+1; j<=3; j++){
				for (int k=j+1; k<=3; k++){
					if ((i!=j)&&(j!=k)&&(k!=i))
					{
						System.out.println(i+" "+j+" "+k);
					}
				}
			} 
		}
	
	}
}
public class Combination{
	public static void main(String[] args){
		CombinationNew ob = new CombinationNew();
		ob.combination();
	}
}