/*
 * Factorials of numbers
 */

 import java.util.*;

public class My14thFactorialNums {

    public static void main(String[] Args){

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number To FInd Factorial Number:- ");

        int num=sc.nextInt();

        int factorial=1;

        for(int i=1;i<num+1;i++){
            factorial=factorial*i;
        }

        System.out.println(factorial);

    }    
}
