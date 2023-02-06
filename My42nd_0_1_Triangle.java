// 1
// 1 0
// 0 1 0
// 1 0 1 0
// 0 1 0 1 0

public class My42nd_0_1_Triangle {
    public static void zop(int lines){
        for(int i=1;i<=lines;i++){
            for(int j=1;j<=i;j++){
                if((i+j)%2==0){
                    System.out.print(1);
                }
                else{
                    System.out.print(0);
                }
            }
            System.out.println();
        }
    }
    public static void main(String[] args){
        zop(5);
    }
}
