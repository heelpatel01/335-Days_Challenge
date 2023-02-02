/*
 * Here, in this code we have to store this particular reversed number in specific variable 
 */
import java.util.*;
public class My11th_ReverseTheNumber {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);

        System.out.print("Enter Number To Reverse:- ");
        int number=sc.nextInt();

        int reverse=0;


        while(number>0){
            int Last_digit=number%10;            //Got Last Digit
            reverse=(reverse*10)+Last_digit;    //Reversed Number And Stored
            number=number/10;                  //(updated) Removed last Digit From Orignal Number

        }
        System.out.println(reverse);
    }
}
