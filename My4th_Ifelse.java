/*Write a Java program to get anumber from the user and print whether it is positive or negative. */

import java.util.*;

public class My4th_Ifelse {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);

        System.out.print("Enter Number To Check It IS Negative Or Positive:- ");
        int num=sc.nextInt();

        if (num>=0)
        {
            System.out.println(num+" Is Positive");
        }
        else
        {
            System.out.println(num+" Is Negative");
        }

    }
    
}
