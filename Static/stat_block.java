//static block using object
import java.io.*;
class stat {
    static int am;
    static String st;
    static {
        am = 16;
        st = "I want to be a human for everyone .";
        }
    public void  display(){
      System.out.println("value of am :"+am);
      System.out.println(st);
    }
  }
public class stat_block{
  public static void main(String[] args){
      stat s = new stat();
      s.display();
  }
}