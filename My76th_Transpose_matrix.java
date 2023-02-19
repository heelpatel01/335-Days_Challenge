import java.util.Scanner;

// Write a program to Find Transpose of a Matrix.
// What is Transpose?
// Transpose of a matrix is the process of swapping the rows to columns. For a 2x3 matrix,
// Matrix
// a11 a12 a13
// a21 a22 a23
// Transposed Matrix
// a11 a21
// a12 a22
// a13 a23

public class My76th_Transpose_matrix {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter The Number Of Rows You Want: ");
        int r=sc.nextInt();
        System.out.println("Enter The Number Of Cols You Want");
        int c=sc.nextInt();

        int arr[][]=new int[r][c];

        System.out.println("Enter The "+r*c+" Numbers");
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                System.out.println("Enter The ("+i+","+j+")");
                arr[i][j]=sc.nextInt();
            }
        }
        
        System.out.println("The Orignal Matrix is:- ");
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
        
        System.out.println("The Transported Matrix Is:- ");
        for(int i=0;i<c;i++){
            for(int j=0;j<r;j++){
                System.out.print(arr[j][i]+" ");
            }
            System.out.println();
        }

        sc.close();
    }
}
