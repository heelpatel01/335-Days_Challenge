public class My57th_Sum_of_SubArrays {
    public static void subarraysum(int arr[]){
        int maxsum=Integer.MIN_VALUE;
        int cursum=0;
        for(int i=0;i<arr.length;i++){
            for(int j=i;j<arr.length;j++){
                cursum=0;
                for(int k=i;k<=j;k++){
                    System.out.print(arr[k]+"=");
                    cursum=cursum+arr[k];
                    if(cursum>maxsum){
                        maxsum=cursum;
                    }
                    System.out.print(cursum);
                }
                System.out.println();
            }
            // System.out.println(maxsum);
            
        }
        System.out.println(maxsum);
    }
    public static void main(String[] args) {
        int arr[]={2,4,6,8};

        subarraysum(arr);
    }
}
