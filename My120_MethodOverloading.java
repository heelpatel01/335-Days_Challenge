public class My120_MethodOverloading {
    public static void main(String [] args){

        MethodOverloading mo=new MethodOverloading();

        float num=mo.sumNum(2.8f,3.5f);
        System.out.println(num);

        mo.sumNum(5,5);
        mo.sumNum(4,2,4);

    }
}

class MethodOverloading{
    public static int sumNum(int a,int b){
        return a+b;
    }
    public static float sumNum(float a,float b){
        return a+b;
    }
    public static int sumNum(int a,int b,int c){
        return a+b+c;
    }
    int sumNum(int a,int b,int x,int f){
        return 1+2;
    }
}

//so this was example of method overloading