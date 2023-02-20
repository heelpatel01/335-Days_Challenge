public class My84rth_Equals_Function{
    public static void main(String[] args){
        String s1="heel";
        String s2="heel";
        String s3=new String("heel");

        //1st con.
        if(s1==s2){
            System.out.println("s1 and s2 are equal");  //✔
        }else{
            System.out.println("s1 and s2 are not equal");
        }

        //2nd con
        if(s1==s3){
            System.out.println("s1 and s3 are equal");
        }else{
            System.out.println("s1 and s3 are not equal");  //✔ 
        }
        

        //so bcz of new keyword makes in new method it will show not equals for that we will equals function.
        if(s1.equals(s3)){
            System.out.println("s1 and s3 are equal");  //✔✔✔
        }else{
            System.out.println("s1 and s3 are not equal");
        }
    }
}