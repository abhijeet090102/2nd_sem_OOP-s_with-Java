/*Write a Java Program to demonstrate use of nested class. */

class nested{
    static int am = 4 * 39;
    int a = 40,m = 20;
    int st = a*m;
    class nest{
        void out(){
            System.out.println("Inside the nested class printng multiplied value "+st);
            System.out.println("Inside nested class value of Static value is "+am);
        }
    }
}
class NestedClass {
    public static void main(String[] args){
        nested obj = new nested();
        nested.nest ob = obj.new nest();
        ob.out();

    }
}
