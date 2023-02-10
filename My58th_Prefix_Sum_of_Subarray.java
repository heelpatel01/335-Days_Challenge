public class My58th_Prefix_Sum_of_Subarray {

    public static void ps(int arr[]){
        int prefix[]=new int[arr.length];

        prefix[0]=arr[0];
        for(int i=1;i<arr.length;i++){
            prefix[i]=prefix[i-1]+arr[i];
        }


        // int start=0;
        // int end=arr.length-1;
        int cursum=0;
        int maxsum=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            int start=i;
            for(int j=i;j<arr.length;j++){
                int end=j;
                cursum= start==0 ? prefix[end]:prefix[end]-prefix[start-1];
                if(cursum>maxsum){
                    maxsum=cursum;
                }
            }
        }
        System.out.println(maxsum);

    }

    public static void main(String []args){
        int arr[]={1,-2,6,-1,3};
        ps(arr);
    }

}
