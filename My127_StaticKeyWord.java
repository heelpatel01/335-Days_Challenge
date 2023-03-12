public class My127_StaticKeyWord{
    public static void main(String [] args){
        Student1 st1=new Student1();
        st1.std=10;
        
        Student1 st2=new Student1();
        System.out.println(st2.std);   //it will not generat any error bcz already in previous Object we stored in static variable some data. so it was created by diffrently.
    }
}
class Student1{
    static int std;

}