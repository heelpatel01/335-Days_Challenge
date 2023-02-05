public class My38th_hollow_Rectangle_using_Function {
    public static void holow_rectange(int line,int col){
        for(int i=1;i<=line;i++){
            for(int j=1;j<=col;j++){
                if(i==1 || i==line || j==1 || j==col){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
    public static void main(String[] args){
        holow_rectange(4,5);
    }
}
