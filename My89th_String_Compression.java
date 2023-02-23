/*
 * aaabbcccc --> (a3b2c4)
 */

public class My89th_String_Compression {
    public static String stringCompression(String str){

        String newstr="";

        for(int i=0;i<str.length();i++){
            Integer count=1;
            // str.charAt(i);
            while(i<str.length()-1 && str.charAt(i)==str.charAt(i+1)){
                count++;
                i++;
            }


            newstr+= str.charAt(i);

            if(count>1){
                newstr += count.toString();
            }

        }

        return newstr;
    }    

    public static void main(String[] args){
        String str="heel patell";
        
        String compressedString=stringCompression(str);
        System.out.println(compressedString);
    }
}
