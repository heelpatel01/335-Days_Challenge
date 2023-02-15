public class My68th_2D_array_searching {
    public static boolean Searchcell(int matrix[][],int key){
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                if(matrix[i][j]==key){
                    System.out.println("Your Key "+key+" is at ("+i+","+j+") cell"); 
                    return true;                   
                }
            }
        }
        System.out.println("your key "+key+" not found");
        return false;
    }

    public static void main(String[] args){
        int matrix[][]={
         {1,2,3}
        ,{4,5,6}
        ,{7,8,9}};

        int key=5;
        System.out.println(Searchcell(matrix, key));
    }
}
