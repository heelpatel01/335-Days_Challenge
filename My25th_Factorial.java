import java.util.*;

//Finding Factorial Using Function:-

public class My25th_Factorial {
    public static int fact(int a){
        int fact=1;

        for (int i=1;i<=a;i++){
            fact=fact*i;
        }
        return fact;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter A Number To Find Factorial:- ");
        int num= sc.nextInt();

        int factorial=fact(num);

        System.out.println(factorial);
    }
}
