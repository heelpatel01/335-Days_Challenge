import java.util.Scanner;

public class My13th_prime_or_not {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int number=sc.nextInt();

        boolean isprime= true;
        
        if (number==1){
            
            System.out.println(number + " is not prime number");
        }
        for(int i=2;i<number;i++){
            if(number%i==0){
               isprime=false;
            }
            else{
                isprime=true;  
            }
        }
        if (isprime=true){
            System.out.println(number+" is prime number");
        }
        else{
            System.out.println(number+" is not prime number");
        }
    }
}
