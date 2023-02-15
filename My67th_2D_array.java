import java.util.Scanner;

public class My67th_2D_array {
    public static void main(String []args){
        int matrix[][]=new int[3][3];
        int m=matrix.length,n=matrix[0].length;

        Scanner sc=new Scanner(System.in);

        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                System.out.print("Enter The Number of "+i+"th row and "+j+"th column");
                matrix[i][j]=sc.nextInt();
            }
        }
        sc.close();
        for(int i=0;i<m;i++){
           for(int j=0;j<n;j++){
            System.out.print(matrix[i][j]+" ");
           }
           System.out.println();
        }
        
    }
}