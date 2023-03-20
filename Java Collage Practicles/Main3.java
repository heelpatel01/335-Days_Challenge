// Write a program to find prime number and find factorial of a number.

public class Main3 {
   public static void main(String[] args) {
    System.out.println(fact(4)); 
    System.out.println(isPrime(10));
    }

   //Check prime?
    public static Boolean isPrime(int num){
        if(num==0 || num==1){
        return false;
    }

    for(int i=2;i<num;i++){

        if(num%i==0){
            return false;
        }
        
    }
    return true;
   }

   //To Find Prime Number
   
   public static int fact(int num){

    int fact=1;
    
    if(num==0 || num==1){
        return 1;
    }
    for(int i=2;i<=num;i++){
        fact=fact*i;
    }
    return fact;
   }
}
