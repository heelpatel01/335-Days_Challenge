//Sum of first n natural numbers

import java.util.*;

public class My8th {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter The Numbers To Get Sum Of Those Number ");
        int num=sc.nextInt();
        int dn=0;

        for(int i=0;i<=num;i++){
            
            dn=i+dn;
            
        }
        System.out.println("Sum of all first"+num+" Numbers is "+dn);
    
    }    
}
