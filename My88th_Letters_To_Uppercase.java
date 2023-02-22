/*
 * "jay shree ram" --> "Jay Shree Ram"
 */

public class My88th_Letters_To_Uppercase {
public static String ltou(String str){
    StringBuilder sb=new StringBuilder("");
    Character ch=Character.toUpperCase(str.charAt(0));
    sb.append(ch);

    for(int i=1;i<str.length();i++){
        if(str.charAt(i)==' ' && i<str.length()-1){
            sb.append(str.charAt(i));
            i++;
            sb.append(Character.toUpperCase(str.charAt(i)));
        }
        else{
            sb.append(str.charAt(i));
        }
    }
    return sb.toString();
}
public static void main(String[] args){
    String name="jAY sHREE rAm";
    String funname=ltou(name);
    System.out.println(funname);
}
}
