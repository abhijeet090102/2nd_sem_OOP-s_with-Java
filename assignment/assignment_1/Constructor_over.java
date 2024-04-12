/* . Write a Java Program to define a class, describe its constructor, overload the
 Constructors and instantiate its object. */
class Constructor {
    Constructor(){
        int a = 4,m = 40;
        System.out.println("Using constructor adding two number a and m "+(a+m));
    }
    Constructor(int a,int m){
        System.out.println("Using constructor overloading add two numbers value is "+(a+m));
    }
}
class Constructor_over{
    public static void main(String[] args){
        Constructor ob = new Constructor();
        Constructor obj = new Constructor(4,20);
    }
}