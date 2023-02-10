public class My59th_Kadanes_Sum_algorithm {
    public static void main(String[] args){
        int arr[]={-2,-3,4,-1,-2,1,5,-3};
        kadane(arr);

    }
    public static void kadane(int arr[]){
        int cursum=0;
        int maxsum=Integer.MIN_VALUE;

        for(int i=0;i<arr.length;i++){
            cursum=cursum+arr[i];
            if(cursum<0){
                cursum=0;
            }
            if(cursum>maxsum){
                maxsum=cursum;
            }

        }

        System.out.println("The Max Sum Is "+maxsum);
    }
}
