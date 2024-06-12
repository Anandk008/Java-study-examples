package Exceptions;
import java.io.*;

public class MethodCallStack {
    public static void fun1(){
        try{
            fun2();

            System.out.println("Fun1 Exited successfully !!");
        } catch (ArithmeticException a) {
            System.out.println("ArithmeticException Caught !\n\n");

            a.printStackTrace();
        }
    }
    static void fun2(){
        System.out.println("Entered Method Fun2");
        int a = 5, b = 0;
        int c = a/b;
        System.out.println(c);
    }
}
