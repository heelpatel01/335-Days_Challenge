public class My62th_bubble_Sort {
public static void bubblesort(int arr[]){
    int n=arr.length;
    for(int turns=0;turns<n-1;turns++){
        for(int j=0;j<n-1-turns;j++){
            if(arr[j]>arr[j+1]){
                //swap
                int temp=arr[j];
                arr[j]=arr[j+1];
                arr[j+1]=temp;
            }
        }
    }
    for(int i=0;i<n;i++){
        System.out.print(arr[i]+" ");
    }
}
public static void main(String[] args){
    int arr[]={9,7,4,6,1,3,2,5,8,0};
    bubblesort(arr);
}
}
