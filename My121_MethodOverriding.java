public class My121_MethodOverriding {
    public static void main(String []args){

        Jihadi jd=new Jihadi();
        jd.human();     //so it will call The Exact this child function and this is called as method overriding

    }
}
class Human{
    void human(){
        System.out.println("Good");
    }
}
class Jihadi extends Human{
    void human(){
        System.out.println("Bad");
    }
}