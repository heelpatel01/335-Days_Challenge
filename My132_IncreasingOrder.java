import java.util.*;
public class My132_IncreasingOrder{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter Number:");
        incNum(10);

        sc.close();

    }

    public static void incNum(int n){
        if(n==1){
            System.out.print(n+" ");
            return;
        }

        incNum(n-1);
        System.out.print(n+" ");
    }
}