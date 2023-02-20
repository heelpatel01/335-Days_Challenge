//check if string is palindrome or not
import java.util.Scanner;

public class My82_palindromString {

    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter String To Check Is It Palindrome Or Not");
        String input=sc.next();
        palindrome(input);
        sc.close();
    }
    public static boolean palindrome(String str){
        int n=str.length();
        for(int i=0;i<n/2;i++){
            if(str.charAt(i)!=str.charAt(n-1-i)){
                System.out.println("String is not palindrome");
                return false;
            }
        }
        System.out.println("String is palindrome");
        return true;
    }


}
