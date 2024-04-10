package Exceptionheading;

import java.util.Scanner;

public class Exceptiondemo {
    static Scanner sc = new Scanner(System.in);
    static int a, b, c;

    public static void main(String[] args) {

        try {
            int result = div();
            System.out.println(result);
        } catch (ArithmeticException ae) {
            System.out.println(ae.getMessage());
        }
    }

    public static int div() throws ArithmeticException {

        a = sc.nextInt();
        b = sc.nextInt();
        if (b == 0)
            throw new ArithmeticException("cannot div by zero");
        c = a / b;
        return c;

    }
}
