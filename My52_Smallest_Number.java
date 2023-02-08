public class My52_Smallest_Number {
    public static int GetSmallest(int arr[]){
        int Min=Integer.MAX_VALUE;

        for(int i=0;i<arr.length;i++){
            if(arr[i]<Min){
                Min=arr[i];
            }
        }
        return Min;

    }

    public static void main(String[] args){
        int arr[]={10,21,5,9,2,99,88,56,100,98,335};
        System.out.println("Smallest Number From Array Is "+GetSmallest(arr));
    }
}
