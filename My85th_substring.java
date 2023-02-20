public class My85th_substring {
    public static String subString(String str,int  si,int ei){
        String subString="";
        for(int i=si;i<ei;i++){
            subString+=str.charAt(i);
        }
        return subString;
    }

    public static void main(String[] args){
        String str="Heel Patel";
        String subString=subString(str, 5, 10); //User Define Function
        System.out.println("User Define Function :-"+"\t"+subString);

        //predefine function 
        System.out.println("Predefine Function "+str.substring(0, 5));
    }
}