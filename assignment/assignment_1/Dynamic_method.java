/* Write a Java Program to define a class, define instance methods and overload 
them and use them for dynamic method invocation.
 */
class Dynamic {
    void multiply(){
        int a = 4 , m = 6;
        System.out.println(" Using instance methode , The multiplied value is"+(a*m));
    }
    void multiply(int a,int m){
        System.out.println("Using instance methode overload the adding value is "+(a+m));
    }
    void multiply(float a,float m){
        System.out.println("Using instance methode overload the adding value in float "+(a+m));
    }
}
class Dynamic_method{
    public static void main(String[] args){
        Dynamic obj = new Dynamic();
        obj.multiply();
        obj.multiply(4,6);
        obj.multiply(4.6f,6.2f);
    }
}