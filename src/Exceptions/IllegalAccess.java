package Exceptions;

public class IllegalAccess {
    static void fun1() throws IllegalAccessException{
        System.out.println("Inside fun1 .");
        throw new IllegalAccessException("demo");
    }
    public static void fun(){
        try {
            fun1();
        } catch (IllegalAccessException e) {
            System.out.println(e + " \n\n");
            System.out.println("Caught in fun..\n\n");
        }
    }
}
