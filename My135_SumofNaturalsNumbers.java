public class My135_SumofNaturalsNumbers {
    public static void main(String[] args){

        System.out.println(sumN(5));

    }
    public static int sumN(int n){

        if(n==1){
            return 1;
        }

        int add=sumN(n-1);
        int nNums=n+add;
        return nNums;

    }
}
