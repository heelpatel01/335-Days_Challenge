public class My56th_subarrays {
    public static void subarray(int arr[]){
        for (int i=0;i<arr.length;i++){
            for(int j=i;j<arr.length;j++){
                for(int k=i;k<=j;k++){
                    System.out.print(arr[k]);
                    // int sum=0;
                    // sum=sum+arr[k];
                    // System.out.println(sum);
                }
                System.out.println();
            }
            System.out.println();
        }
    }

    public static void main(String[] args){
        int nums[]={2,4,6,8,10};

        subarray(nums);


    }
}
