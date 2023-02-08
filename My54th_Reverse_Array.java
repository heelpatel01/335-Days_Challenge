public class My54th_Reverse_Array {
    public static void reverse(int arr[]){

        int start=0;
        int end=arr.length-1;
        
        while(start<end){
            int temp=arr[end];
            arr[end]=arr[start];
            arr[start]=temp;
            

            start++;
            end--;
            // System.out.println(temp);
        }
    }
    public static void main(String[] args){
        int arr[]={20,30,40,50,60,70,80};

        reverse(arr);

        System.out.print("{");
        
        for(int i=0;i<arr.length;i++){
            System.out.print(+arr[i]+",");
        }
        System.out.print("}");

    }
}
