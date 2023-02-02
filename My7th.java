//print numbers from 0 to 10
//and 
// 0 to n(From User)

import java.util.*;

public class My7th {
    public static void main(String[] args){
        for(int i=0;i<=10;i++){
            System.out.println(i);
        }

        System.out.println("Enter Number N to print ");

        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for (int i=0;i<=n;i++){
            System.out.println(i);
        }
    }
}

