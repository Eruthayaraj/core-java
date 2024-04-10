package Lambda;
public class LambdaDemo { 
  
    public static void main(String[] args) 
    { 
       Studentinfo s=(name,regno) ->{
        return "name:"+name+" "+"regno"+regno;
       } ;
       System.out.println(s.inf("eruthayaraj", 05432));
    } 
} 