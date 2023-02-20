public class My81_CharAtMethod {
    public static void main(String []args){
        String name="Heel Patel";
        System.out.println(name.charAt(2)); //e
        printLetters(name);

    }

    public static void printLetters(String str){
        for(int i=0;i<str.length();i++){
            System.out.print(str.charAt(i)); //full string print using loop
        }
    }
}
