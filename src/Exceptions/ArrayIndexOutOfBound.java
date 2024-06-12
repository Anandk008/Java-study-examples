package Exceptions;
import java.io.*;
import java.util.*;

public class ArrayIndexOutOfBound {
    public static void arrayIndexOutOfBound() {
        int[] arr = {1, 2, 3, 4, 5};
        try{
            for(int i = 0; i <= arr.length; i++)
                System.out.println(arr[i]);
        } catch (ArrayIndexOutOfBoundsException e){
            System.out.println("\n Index Out Of Bound Exception Caught !");
        }
    }
}
