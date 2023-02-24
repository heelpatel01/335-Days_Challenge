/* Determine if 2 Strings are anagrams of each other. What are anagrams? If two strings contain the same 
characters but in a different order, they can be said to be anagrams. Consider "race" and "care". In this 
case, "race"'s characters can be formed into "a study", or "care"'s characters can be formed into "race". 
Below is a Java program to check if two strings are anagrams or not.
*/
import java.util.Arrays;
public class My92th_checkAnagrams {
    public static Boolean checkAnagram(String str1,String str2){
        //check the length
        if(str1.length()!=str2.length()){
            return false;
        }

        //Converts The String To Any Case (LowerCase or UpperCase)
        str1=str1.toLowerCase();
        str2=str2.toLowerCase();

        //Convert It Into Char Array.
        char[] ch1=str1.toCharArray();
        char[] ch2=str2.toCharArray();

        //Sort These Array
        Arrays.sort(ch1);
        Arrays.sort(ch2);

        //check both arrays are Equal or Not?
        return Arrays.equals(ch1, ch2);
    }

    public static void main(String[] args){
        String str1="Heel",str2="Heel";
        System.out.println(checkAnagram(str1,str2));
    }
        
}
