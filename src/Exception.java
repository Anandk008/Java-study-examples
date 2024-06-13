import java.util.*;
import RecordsExp.*;
import Exceptions.*;


public class Exception {
    public static void main(String[] args) {

        int input;
        boolean exit = false;
        Scanner sc = new Scanner(System.in);
        enum Choice {
            FILE_NOT_FOUND,
            INDEX_OUT_OF_BOUND,
            ARITHMETIC_EXCEPTION,
            ILLEGAL_ACCESS,
            RECORD_DEMO,
            EXIT
        }


        while (!exit) {

            System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~\n Choose any of the below to carry out that type of Exception : \n" + "1. File Not Found \n2.Array Index Out Of Bound \n3.Arithmetic Exception (Method Call) \n4. Illegal Access Exception \n5. Record Demo (Different from above)  \n6. To Exit the Program ");
            System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~\n Enter The input : ");
            input = sc.nextInt();

            if (input < 1 || input > 6) {
                System.out.println("Choice out of bound !!");
                continue;
            }

            Choice enumChoice = Choice.values()[input - 1];

            switch (enumChoice) {
                case FILE_NOT_FOUND:
                    FileNotFount.fileNotFound();
                    break;
                case INDEX_OUT_OF_BOUND:
                    ArrayIndexOutOfBound.arrayIndexOutOfBound();
                    break;
                case ARITHMETIC_EXCEPTION:
                    MethodCallStack.fun1();
                    break;
                case ILLEGAL_ACCESS:
                    IllegalAccess.fun();
                    break;
                case RECORD_DEMO:
                    Student s1 = new Student(1, "Ajay");
                    System.out.println("Name : " +s1.name()+" Roll No : "+s1.rollNo() );
                    System.out.println(s1.toString());
                    break;
                case EXIT:
                    System.out.println("The program will exit now !!");
                    exit = true;
                    break;
                default:
                    System.out.println("Enter Valid Option !");
                    break;
            }
        }


    }
}
