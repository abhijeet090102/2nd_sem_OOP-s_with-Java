import java.io.*;
import java.util.*;
class Swap_am {
    Swap_am (int am , int st){
        System.out.println("The value of am "+am +" and the value of st "+st+" before swaping");
        int temp = am;
        am = st;
        st = temp;
        System.out.println("The value of am "+am +" and the value of st "+st+" after swaping");
        return am;
    }
}
class Swap{
    public static void main(String[] args){
        Scanner am = new Scanner(System.in);
        int a ,m;
        System.out.print("Enter the first no :");
        a = am.nextInt();
        System.out.print("Enter the second no :");
        m = am.nextInt();
        Swap_am ob = new Swap_am(a,m);
        //ob.swap(a,m);

    }
}