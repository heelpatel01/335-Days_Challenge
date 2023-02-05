public class My40th_inverted_half_Pyramid_with_numbers {
    public static void pyramid(int line){
        for(int i=line;i>=1;i--){
            for(int j=1;j<=i;j++){
                System.out.print(j);
            }
            System.out.println();
        }
    }
    public static void main(String[] args){
        pyramid(5);
    }
}
