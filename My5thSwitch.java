import java.util.Scanner;

/*
 * Write a Java program to input week number (1-7) and print day of week name using switch case.
 */

public class My5thSwitch {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);

        System.out.print("Enter Number For Knowing The Day Name ");
        int week=sc.nextInt();

        switch (week){
            case 1:
            System.out.println("Monday");
            break;

            case 2:
            System.out.println("Tuesday");
            break;

            case 3:
            System.out.println("Wednesday");
            break;

            case 4:
            System.out.println("Thursday");
            break;

            case 5:
            System.out.println("Frieday");
            break;

            case 6:
            System.out.println("Saturday");
            break;

            case 7:
            System.out.println("sunday");
            break;

        }
    }
}
