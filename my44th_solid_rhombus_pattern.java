public class my44th_solid_rhombus_pattern {

    public static void rhombus(int lines){
        for(int i=1;i<=lines;i++){
            //space
            for(int space=1;space<=lines-i;space++){
                System.out.print(" ");
            }
            for(int star=1;star<=lines;star++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void main(String[] args){
        rhombus(4);
    }
    
}
