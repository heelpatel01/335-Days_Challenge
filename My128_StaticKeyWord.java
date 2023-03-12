public class My128_StaticKeyWord {
    public static void main(String args[]){
        stud s1=new stud();
        s1.schooleName="SSV";

        stud s2=new stud();
        System.out.println(s2.schooleName);

        stud s3=new stud();
        s3.schooleName="PIET";

        stud s4=new stud();
        System.out.println(s4.schooleName);

        System.out.println(s1.schooleName);
    }
}
class stud{

    //Logic of this program will be same we can used it anywhere so we can Make it Static so Bcz of Static we don't need multiple creation...And can used multiple tyms...
    static int returnPercentage(int psnm,int java,int os,int cn,int daa){
        return (psnm+java+os+cn+daa)/5;
    }


    static String schooleName;

}