public class My32nd_Prime_Range {
    public static boolean isprime(int num){
        if(num==2){
            return true;
        }
        for(int i=2;i<=num-1;i++){
            if(num%i==0){
                return false;
            }
        }
        return true;

    }

    public static void PrimeNums(int num){
        for(int i=2;i<num-1;i++){
            if(isprime(i)==true){

                System.out.println(i+" ");

            }
        }
    }

    public static void main(String[] args){
        PrimeNums(10);
    }
}
