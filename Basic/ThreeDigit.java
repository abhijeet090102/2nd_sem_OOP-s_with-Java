import java.util.Scanner;

public class ThreeDigit {

    public static void main(String[] args) {
            Scanner sc=new Scanner(System.in);
            
            for(int i=0;i<3;i++)
            {
                String s1 =sc.next();
                int x =sc.nextInt();
                
                //2 digits converted into 3 digit
                System.out.printf("%-15s%03d%n",s1,x);
            }
            
            
    }
}