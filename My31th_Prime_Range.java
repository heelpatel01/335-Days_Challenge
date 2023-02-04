//pending...without using function

public class My31th_Prime_Range {

    public static boolean isprime(int n){
        if(n==2){
            return true;
        }

        for(int i=2;i<=n-1;i++){
            if(n%i==0){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args){


        int number=100;

        // boolean check=isprime(number);
        for(int i=2;i<=number-1;i++){

            // boolean isprimenum=isprime(number);

            if(isprime(i)==true){

                System.out.print(i+",");

            }

        }

    
    }

    

}
