import java.util.Scanner;

public class My134FactorialRecursion {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n1=sc.nextInt();
        System.out.println(fact(n1));
        sc.close();


    }

    public static int fact(int n){
        
        if(n==1){
            return 1;
        }

        int fnm1=fact(n-1);
        int fact=n*fnm1;
        return fact;
    }
}
