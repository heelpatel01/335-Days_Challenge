//second way to check is prime or not:-

public class my29th {
    public static boolean isprime(int a){
        for(int i=2;i<=a-1;i++){
            if(a%i==0){
                return false;
            }
        }
    return true;
    }

    public static void main(String[] args){
        System.out.println(isprime(37));
    }
}
