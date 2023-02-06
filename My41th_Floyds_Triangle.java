// Floyds Triangle pattern:-
// 1
// 2  3
// 4  5  6
// 7  8  9  10
// 11 12 13 14  15

public class My41th_Floyds_Triangle {
    public static void floyd(int lines){
        int counter=1;
        for(int i=1;i<=lines;i++){
            for(int j=1;j<=i;j++){
            System.out.print(counter+ "  ");
            counter++;
        }
        System.out.println();
        }
    }

    public static void main(String[] args){
        floyd(5);
    }
}
