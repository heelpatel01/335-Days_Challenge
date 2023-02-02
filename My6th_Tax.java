/*

Income Tax Calculator:-
income<5 Lakhs
0% Tax

income Between 5lakhs-10lakhs
20% Tax

Income >10lakhs
30% Tax

*/

import java.util.*;

public class My6th_Tax {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);

        System.out.print("Enter Your Income:- ");
        
        int income=sc.nextInt();

        if (income>500000 & income<1000000){
            System.out.println("you have to pay "+(income*0.2f)+"rs Tax.");
        }
        else if(income>1000000){
            System.out.println("you have to pay"+ (income*0.30)+"rs tax");
        }
        else{
            System.out.println("you have to not pay any kind of tax");
        }
    }
}
