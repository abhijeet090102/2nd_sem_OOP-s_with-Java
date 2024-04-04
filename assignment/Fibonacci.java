import java.io.*;
import java.util.*;
class fibo{
    void fibonum(int am){
        int m=0,a=1;
        int tota = 0;
        int sum =0;
        System.out.println("The value of fibonacci is "+m);
        System.out.println("The value of fibonacci is "+a);
        for (int i=3; i<=am; i++){
            sum = m +a;
            System.out.println("The value of fibonacci is "+sum);
            m = a;
            a = sum;
            //tota += sum;
        }
        tota = a + sum;
        System.out.println("The total sum value of fibonacci is "+tota);
        
    }
}
class Fibonacci{
    public static void main(String[] args) {
        Scanner st = new Scanner(System.in);
        int a = st.nextInt();
        fibo ob = new fibo();
        ob.fibonum(a);
    }
}