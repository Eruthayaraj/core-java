package Lambda;

public class Anonmyous {
    public static void main(String[] args) {
     Emp obj=new Emp(){
      public void display()
     {
      System.out.println("hello");
     }
     public void display1()
     {
       System.out.println("hii");
     }
     }  ; 
     obj.display();
    }
}
//employee class
class Emp{
    String name="hh";
    String Salary;
  public void display()
  {
    System.out.println("hii");
  }
 nn
}
