import java.util.Scanner;

//Write a Java program to check if a number is a palindrome in Java?
// (121 is a palindrome, 321 is not)A number is called a palindrome if 
// the number is equal to the reverse of a number e.g.,121 is a palindrome because the reverse of 121 is 121 it self.On the other hand,321 is not a palindrome because the reverse of 321 is 123, which is not equal to 321.

public class pqs_3 {

    public static int reversed(int num){

        int revnum=0;

        while(num>0){
            int ld=num%10;

            revnum=revnum*10+ld;

            num=num/10;
        }

        return revnum;

    }

    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);


        System.out.print("Enter Number To Check The Given Number Is Palindrome or Not:- ");
        int num=sc.nextInt();

        sc.close();

        int revnum=reversed(num);

        if(num==revnum){
            System.out.println("The Given Number Is Palindrome");
        }
        else{
            System.out.println("The Given Number Is Not Palindrome");
        }
    }
    
}
