import java.io.*;
class Person {
  int id;
  String name;
  
  public Person(int id,String name) {
    this.id = id;
    this.name = name;
  }
}
public class PersonBuilder{
  public static Person buildPerson(int id,String name){
    return new Person(id,name);
    
  }
  public static void main(String[] args){
    int id = 40;
    String name = "Abhijeet karmakar";
    Person person = null;
    person = buildPerson(id,name);
    System.out.println(id+" "+name);
  }
}
