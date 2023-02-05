public class My39th_inverted_half_pyramid {
    public static void pyramid(int lines){
        for(int i=1;i<=lines;i++){
            for(int j=1;j<=lines-i;j++){
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void main(String[] args){
        pyramid(5);
    }
}
