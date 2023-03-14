public class My130_DecreasingNumRecursion {
    public static void main(String args[]){
        int n=10;
        decNum(n);
    }

    public static void decNum(int n){
        if(n==1){
            System.out.println(n);
            return;
        }
        System.out.println(n);
        decNum(n-1);        
    }
}
