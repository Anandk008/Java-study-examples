package DateTime;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class DateTim {
    public static void main(String[] args) {
        LocalDate d = LocalDate.now();
        System.out.println("Local Date is : "+d);
        LocalTime t = LocalTime.now();
        System.out.println("Local Time is : "+t);
        LocalDateTime td = LocalDateTime.now();
        System.out.println("Local Date and Time is : " + td);
    }
}
