public class my24th_swap_using_function {

    public static void swap(int a,int b){
        int temp=a;
        a=b;
        b=temp;
        System.out.println("a= "+a);
        System.out.println("b= "+b);

    }
    public static void main(String[] args) {
        int a=10;
        int b=20;
        swap(a,b);
    }
}
 