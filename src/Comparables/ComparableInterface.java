package Comparables;

import java.util.Arrays;
import java.util.Comparator;

public class ComparableInterface {
    public static void main(String[] args) {
        Point[] arr = {
                new Point(1, 2),
                new Point(10, 20),
                new Point(25, 5) };
        Arrays.sort(arr, (p1, p2) -> (p1.x- p2.x));

        System.out.println( "Compared by Natural order using Comparable : " + Arrays.toString(arr));

        Arrays.sort(arr, Comparator.comparing(Point :: getY));
        System.out.println("Comparing by Using Comparator : " + Arrays.toString(arr));


        System.out.println("\n\nPrinting the Strings");
        String[] str = {"gfg", "IDE", "GFG"};
        Arrays.sort(str, String::compareToIgnoreCase);
        System.out.println(Arrays.toString(str));
    }
}
