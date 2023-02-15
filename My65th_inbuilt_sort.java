import java.util.Arrays;

public class My65th_inbuilt_sort {
    public static void main(String args[]){
        int arr[]={5,4,1,3,2};
        // Arrays.sort(arr);             //1 2 3 4 5 
        Arrays.sort(arr,0,3);    //1,4,5,3,2

        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
}
