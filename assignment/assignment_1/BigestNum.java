import java.io.*;
import java.util.*;
class big{
    void big_num(int am , int st , int ma){
        if (am > st && am >ma){
            System.out.println("The biggest no is "+am);
        }
        else if (st > am && st > ma){
            System.out.println("The biggest no is "+st);
        }
        else if (ma>am && ma >st){
            System.out.println("The biggest no is "+ma);
        }
    }
}
class BigestNum {
    public static void main(String[] args){
        Scanner am = new Scanner(System.in);
        int a , m ,t;
        System.out.println("Enter the first number ");
        a = am.nextInt();
        System.out.println("Enter the Second number ");
        m = am.nextInt();
        System.out.println("Enter the Third number ");
        t = am.nextInt();
        big ob = new big();
        ob.big_num(a,m,t);

    }
}
