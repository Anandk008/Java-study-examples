package Generics;

public class GenericsEx {
    public static <T> int count(T[] arr, T x){
        int res = 0;
        for(T e : arr) if(e.equals(x)) res++;
        return res;
    }

    public static void main(String[] args) {
        Integer []arr = {10, 20, 10, 11, 21,10};
        System.out.println(count(arr, 10));
    }
}
