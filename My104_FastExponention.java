public class My104_FastExponention {
    public static int fastExp(int a,int n){
        int ans=1;

        while(n>0){
            if((n & 1)!=0){
                ans=ans*a;
            }
            a=a*a;
            n=n>>1;
        }
        return ans;
    }

    public static void main(String[] args){
        int a=3;
        int n=5;
        System.out.println(fastExp(a, n));
    }
}
