//FUNCTION OVERLOADING
// We Can Use Same Name Function Multiple Time...
//there is 3 ways to diffrenciate
//1.Data Type Of Parameter
//2.Numbers Of Parameter
//


public class my27th_function_overloading {
    public static int multipication(int a,int b){
        return a*b;
    }
    public static float multipication(float a,float b){
        return a*b;
    }
    public static double multipication(double a, double b){
        return a*b;
    }

    public static void main(String[] args) {
        System.out.println("Int-->"+multipication(10,10));
        System.out.println("Float-->"+multipication(9.5,2.5));
    }


}
