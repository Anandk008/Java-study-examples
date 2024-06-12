package Exceptions;
import java.io.*;
import java.util.*;

public class FileNotFount {
    // Basic Scanner exception
    public static void fileNotFound(){

    try{
        Scanner sc = new Scanner(new File("input.txt"));
        System.out.println("Try Worked !");
    } catch (FileNotFoundException e) {
        System.out.println("File is not Found, Exception working !");
    }
    finally {
        System.out.println("Both after try / catch, finally runs !");
    }

    System.out.println("Whatever be on upside, Life goes on !");

    }
}
