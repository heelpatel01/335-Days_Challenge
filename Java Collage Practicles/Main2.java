// Write a program to perform mathematical operations and print total and average of five numbers.

public class Main2 {
    public static void main(String[] args) {
        //Mathmatical operations:-
        System.out.println("Addition:- "+(5+5));
        System.out.println("Multipication:- "+(5*5));
        System.out.println("Subtraction:- "+(5-5));
        System.out.println("Divide:- "+(10/2));
        System.out.println("Modulo:- "+(10%2));

        //print total and average of five numbers.
        int a1=10,a2=20,a3=30,a4=40,a5=50;
        int total = a1+a2+a3+a4+a5;

        int avg= (total/5);

        System.out.println("total is "+total);
        System.out.println("Average is "+avg);


        
    }
}
