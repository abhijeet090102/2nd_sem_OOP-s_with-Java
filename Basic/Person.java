import java.io.*;
class PersonN{
  int a = 0;
  static int m; // static variable is first created
  PersonN(){
    m++;
    }
  public void showdata(){
    System.out.println ("value of a "+a);
    System.out.println("value of m "+m);
    }
}



public class Person{
  public static void main(String[] args) {
      PersonN am = new PersonN();
      am.showdata();
      PersonN st = new PersonN();
      st.showdata();
    }
 }