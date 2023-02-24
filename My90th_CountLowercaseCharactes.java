public class My90th_CountLowercaseCharactes {
    public static int CountLowerChars(String str){
        int count=0;
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)==Character.toLowerCase(str.charAt(i))){
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args){
        String str="heEl";
        int count=CountLowerChars(str);
        System.out.println(count);
    }
}
