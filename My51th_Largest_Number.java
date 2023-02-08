public class My51th_Largest_Number {
    public static int Largest(int arr[]){
        int largenum=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            if(largenum<arr[i]){
                largenum=arr[i];
            }
        }
        return largenum;
    }

    public static void main(String[] args){
        int arr[]={1,2,6,3,5};
        int largestnum=Largest(arr);
        System.out.println(largestnum);

    }
}
