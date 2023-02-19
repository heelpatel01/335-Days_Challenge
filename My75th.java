/*
Question 2 : Print out the sum of the numbers in the second row of the “nums” array.
Example :
Input - int[][] nums = { {1,4,9},{11,4,3},{2,2,3} };
Output - 18
*/

public class My75th{
    public static void main(String[] args){
        int nums[][]={ {1,4,9},{11,4,3},{2,2,3} };
        System.out.println(secondRowSum(nums));

    }
    public static int secondRowSum(int nums[][]){
        int sum=0;
        for(int i=0;i<nums[0].length;i++){
            sum+=nums[1][i];
        }
        return sum;
    }
}