import java.util.*;
class MonthArray{
	//array_var = new type[size];

	public static void main(String[] args){
// one dimentional array declearing 
		//int[] month_days;
		//month_days = new int[4];
		//month_days[0] = 29;
		//month_days[1] = 22;	
		//month_days[2] = 24;
		//month_days[3] = 20;

// array declearing using another type 
		//int[] month_days = {29,28,30,31,30};

// user define and user input array values 
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter month calender size ");
		int am = sc.nextInt();
		int[] month_days  = new int[am];
		for (int j=0; j<am; j++){
			System.out.println("Enter month dates: ");
			month_days[j] = sc.nextInt();
		}
		System.out.println("In leap year february has "+ month_days[1] + " days");
		for (int i=0; i<4; i++){
			System.out.println("all months in calender days are "+month_days[i]);
		}
	}
}