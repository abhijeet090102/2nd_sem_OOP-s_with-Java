// for each loop 
class ForEach{
	public static void main(String[] args){
	int[] numa = {10,2,43,5,6,5,30,3,54,6};
	int sum = 0;
	//for (int i = 0; i<10; i++) sum+= numa[i];
	//for (int c:numa) sum += c;
	for (int am:numa){
		System.out.println("The value of array are: "+am);
		sum += am;
	}
	System.out.println("Total sum of all array value is :"+sum);
	}
}