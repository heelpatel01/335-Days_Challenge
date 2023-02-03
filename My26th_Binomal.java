public class My26th_Binomal {

    public static int fact(int a){
        int fact=1;
        for(int i=1;i<=a;i++){
            fact=fact*i;
        }
        return fact;
    }

    public static void main(String args[]){
        int n=5;
        int r=2;

        int factn=fact(n);
        int factr=fact(r);

        int factnmr=fact(n-r);

        int binomal=factn/(factr*factnmr);

        System.out.println(binomal);
    }
    
}
