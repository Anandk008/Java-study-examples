package Optionls;
import java.util.*;
import static Optionls.Student.findStudent;


public class Optionl {
    public static void main(String[] args) {
        Optional<Student> s1 = findStudent(5);
        if(s1.isPresent()) System.out.println(s1.get().name);
        else System.out.println(0);
        System.out.println();
    }
}

