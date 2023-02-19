// Print the number of 7’s that are in the 2d array.
// Example :
// Input - int[][] array = { {4,7,8},{8,8,7} };
// Output - 2
public class My74th {
    public static void main(String args[]){
        int[][] array = { {4,7,8},{8,8,7} };
        System.out.print(count(array));

    }
    public static int count(int arr[][]){
        int count=0;
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[0].length;j++){
                if(arr[i][j]==7){
                    count++;
                }
            }
        }
        return count;
    }
}
