import java.io.*;
class Person {
  int a = 0;
  static int m; // static variable is first created
  Person(){
    m++;
    }
  public void showdata(){
    System.out.println ("value of a "+a);
    System.out.println("value of m "+m);
    }
}



public class Main {
  public static void main(String[] args) {
      Person am = new Person();
      am.showdata();
      Person st = new Person();
      st.showdata();
    }
 }