import java.io.*;
import java.util.*;
class fact{
    
    long fact1(long am){
        if (am == 0 || am ==1 ){
            return 1;
        }
        return am * fact1(am-1);
    }
    
}
class Fact_recur {
    public static void main(String[] args){
        Scanner a = new Scanner(System.in);
        System.out.print("Enter the factorial no :");
        long st = a.nextInt();
        fact ob = new fact();
        long factor = ob.fact1(st);
        System.out.print("The factorial value is :"+factor);
    }
}
