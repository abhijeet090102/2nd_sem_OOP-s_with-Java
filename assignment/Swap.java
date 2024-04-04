import java.io.*;
import java.util.*;
class Swap_am {
    int swap (int am , int st){
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
        a = am.nextInt();
        m = am.nextInt();
        Swap_am ob = new Swap_am();
        ob.swap(a,m);

    }
}