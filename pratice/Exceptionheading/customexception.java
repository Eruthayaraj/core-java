package Exceptionheading;

import java.util.Scanner;

public class customexception {
    String email = "eruthayaraj1100@gmail.com";
    int password = 1100;
    static Scanner sc = new Scanner(System.in);
    static boolean result = true;

    public static void main(String[] args) {
        customexception com = new customexception();
        try {
            int temp = sc.nextInt();
            com.checkpassword(temp);
            
        } catch (PasswordException pe) {
            System.out.println(pe);
        }
        System.out.println(result);
    }

    public boolean checkpassword(int password) throws PasswordException {

        if (this.password != password) {
            result = false;
            throw new PasswordException("password wrong");
        }
        return result;

    }

}

class PasswordException extends Exception {
    public PasswordException(String string) {
        super(string);
    }
}
