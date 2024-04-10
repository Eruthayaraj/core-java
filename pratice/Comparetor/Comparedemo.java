package Comparetor;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Comparedemo {
    public static void main(String[] args) {
        List<Student> stu=new ArrayList<Student>();
        stu.add(new Student("surya", 20));
        stu.add(new Student("raj", 21));
        stu.add(new Student("nananee", 23));

   //using Comparetor intrface
        //  Comparator <Student>com=(o1,o2) ->{  return o1.name.length() > o2.name.length() ?1 :-1; };
        //  Collections.sort(stu,com);
   
        //using Comparable interface
          Collections.sort(stu);
          for (Student student : stu) {
            System.out.println(student);
          }
         
    }

}

 class Student implements Comparable<Student> {
 String name;
 int age;
@Override
public String toString() {
    return "Student [name=" + name + ", age=" + age + "]";
}
public Student(String name, int age) {
    this.name = name;
    this.age = age;
}
@Override
public int compareTo(Student that) {
   if(this.age <that.age)return -1;
   else return 1;
   
}
 
    
}