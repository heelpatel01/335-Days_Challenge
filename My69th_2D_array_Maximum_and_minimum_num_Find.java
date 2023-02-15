//Find The Minimum And Maximum Number From 2d aaray matrix.

public class My69th_2D_array_Maximum_and_minimum_num_Find{
    public static void minmax(int matrix[][]){

        int min=Integer.MAX_VALUE;
        int max=Integer.MIN_VALUE;

        for(int r=0;r<matrix.length;r++){
            for(int c=0;c<matrix[0].length;c++){
                if(matrix[r][c]>max){
                    max=matrix[r][c];
                }
                if(matrix[r][c]<min){
                    min=matrix[r][c];
                }
            }
        }
        System.out.println("The Maximum Value From Matrix Is "+max);
        System.out.println("The Minimum Value From Matrix Is"+min);


    }

    public static void main(String[] args){
        int matrix[][]={{90,23,999},{90,28,1920},{9029,355,900335}};
        minmax(matrix);
    }


}