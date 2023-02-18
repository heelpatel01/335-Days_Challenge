public class My73rd_stairCaseSearch {
    public static Boolean stairCaseSearch(int matrix[][],int key){
        int row=matrix.length-1;
        int col=0;

        while(row >= 0 && col < matrix[0].length){
            if(key==matrix[row][col]){
                System.out.println("Key Found At("+row+","+col+")");
                return true;
            }

            if(key<matrix[row][col]){
                row--;
            }
            if(key>matrix[row][col]){
                col++;
            }
            
        }
        System.out.println("Key Doesn't Exist In Matrix!");
        return false;
    }

    public static void main(String []Args){
        int matrix[][]={{10,20,30,40},{15,25,35,45},{27,29,38,48},{32,33,39,50}};
        int key=30;
        stairCaseSearch(matrix, key);
}}
