public class My53_Binary_search {
    public static int BinarySearch(int arr[],int key){

        int start=0;
        int end=(arr.length-1);
        while(start<=end){
            int mid=(start+end)/2;
            if(arr[mid]==key){
                return mid;
            }
            else if(arr[mid]>key){
                end=mid-1;
            }
            else{
                start=mid+1;
            }

        }
        return -1;
    }

    public static void main(String[] args){
        int nums[]={2,4,6,8,10,12,14,16,18};
        int key=18;

        int index=BinarySearch(nums, key);

        if(index==-1){
            System.out.println("Your Key "+key+" Doesn't Not Found");
        }
        else{
            System.out.println("Your Key Is At "+index+"th index");
        }
    }
}
