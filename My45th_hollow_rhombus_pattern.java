//     *****
//    *   *
//   *   *
//  *   *
// *****


public class My45th_hollow_rhombus_pattern {
    public static void hrp(int lines){

        // outer lines
        for(int i=1;i<=lines;i++){

            //for spaces
            for(int j=1;j<=(lines-i);j++){
                System.out.print(" ");
            }

            //for hollow stars
            for(int j=1;j<=lines;j++){
                if(i==1 || i==lines || j==1 || j==lines){
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
        hrp(5);
    }
}
