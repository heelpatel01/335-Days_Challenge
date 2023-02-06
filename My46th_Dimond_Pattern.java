public class My46th_Dimond_Pattern {
    public static void dimond(int lines){
        //first half outer lines
        for(int i=1;i<=lines;i++){
            // space
            for(int space=1;space<=(lines-i);space++){
                System.out.print(" ");
            } 
            //stars
            for(int star=1;star<=(2*i)-1;star++){
                System.out.print("*");
            }
            System.out.println();
        }
        //second half outer lines
        for(int i=lines;i>=1;i--){
            //space
            for(int j=1;j<=(lines-i);j++){
                System.out.print(" ");
            }
            //stars
            for(int j=1;j<=(2*i)-1;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void main(String[] args){
        dimond(5);
    }
}
