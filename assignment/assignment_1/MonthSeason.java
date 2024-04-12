/*Write a Java program that prints the season name corresponding to its month number using 
If-else and switch- case statements.
*/
import java.io.*;
import java.util.*;
class MonthSeason{
	MonthSeason(int a){
		int am = a;
		if (am == 3 || am == 4){
			switch(am){
				case 3:
					System.out.println(" The season is Spring Season (Vasant Ritu) Hindu month is Chaitra ");
				case 4:
					System.out.println(" The season is Spring Season (Vasant Ritu) Hindu month is Baisakh ");
			}
		}
		else if (am == 5 || am ==6){
			switch(am){
				case 5:
					System.out.println(" The season is Summer (Grishma Ritu) Hindu month is Jyeshta ");
				case 6:
					System.out.println(" The season is Summer (Grishma Ritu) Hindu month is Aashaadha ");
			}	
		}
		else if (am == 7 || am == 8){
			switch(am){
				case 7:
					System.out.println(" The season is Monsoon (Varsha Ritu) Hindu month is Shravan ");
				case 8:
					System.out.println(" The season is Monsoon (Varsha Ritu) Hindu month is Bhadrapad ");
			}
		}
		else if (am == 10 || am == 11){
			switch(am){
				case 10:
					System.out.println(" The season is Autumn (Sharad Ritu)  ");
				case 11:
					System.out.println(" The season is Autumn (Sharad ritu)  ");
			}
		}
		else if (am == 12 || am == 1){
			switch (am){
				case 12:
				System.out.println("The season is Pre-winter (Hemant Ritu) ");
				case 1:
				System.out.println("The season is Pre-winter (Hemant ritu)");
			}
		}
		else if (am == 1 || am == 2){
			switch (am){
				case 1:
					System.out.println("The season is Winter (Shishir Ritu) ");
				case 2:
					System.out.println("The season is Winter (Shishir Ritu)");
			}
		}
	}

	public static void main(String[] args){
		Scanner am = new Scanner(System.in);
		int st = am.nextInt();
		MonthSeason obj = new MonthSeason(st);
	}
}