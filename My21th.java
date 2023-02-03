// Functions With Parameter

public class My21th {
    public static void main(String[] args){

        System.out.println(sum(10,20));  //way 1 to call and pass actual parameter :-10,20

        int res=sum(10, 20);                //way 2 to call and pass actual parameter
        System.out.println(res);  


    }

    public static int sum(int a, int b){  //formal parameter:- a,b
        return a+b;
    }
}
