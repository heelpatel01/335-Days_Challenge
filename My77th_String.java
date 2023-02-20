// There are two ways to create String object:

// By string literal
// By new keyword


public class My77th_String {
    public static void main(String[] args){
        //By String Literal
        String s1="Jay Shree Ram";

        //By New Keyword
        String s2=new String("Jay Jay Shree Ram");

        //By New Keyword + Converting Char Array In String
        char ch[]={'P','r','o','g','r','a','m','m','e','r'};
        String s3=new String(ch);

        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);
    }
}
