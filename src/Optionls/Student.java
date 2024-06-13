package Optionls;

import java.util.*;

class Student {
     String name;
     int rollNo;

    public Student(String name, int rollNo) {
        this.name = name;
        this.rollNo = rollNo;
    }

    public static Optional<Student> findStudent(int rollNo){
        Student s1;
        if (rollNo == 2) s1 = new Student("Ajay", 2);
        else s1 = new Student(null, 0);
        return Optional.ofNullable(s1);
    }
}
