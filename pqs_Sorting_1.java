/*
"Use the following sorting algorithms to sort an array in DESCENDING order:

a. Bubble Sort
b. Selection Sort
c. Insertion Sort
d. Counting Sort

You can use this array as an example: [3, 6, 2, 1, 8, 7, 4, 5, 3, 1]"
*/

public class pqs_Sorting_1 {
    //bubble sort
    public static void bubblesort(int[] arr){
        for(int i=0;i<arr.length-1;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[j]>arr[i]){
                    //swap
                    int temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }
        }
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }

    //selection sort
    public static void selectionsort(int[] arr){
        for(int i=0;i<arr.length-1;i++){
            int minpos=i;
            for(int j=1+i;j<arr.length;j++){
                if(arr[minpos]<arr[j]){
                    minpos=j;
                }
            }
            //swap
            int temp=arr[minpos];
            arr[minpos]=arr[i];
            arr[i]=temp;
        }
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }

    //insertion sort
    public static void insertionSort(int[] arr){
        for(int i=1;i<arr.length;i++){
            int curr=arr[i];
            int prev=i-1;
            while(prev>=0 && arr[prev]>curr){
                arr[prev+1]=arr[prev];
                prev--;
            }
            arr[prev+1]=curr;
        }
        for(int i=arr.length-1;i>0;i--){
            System.out.print(arr[i]+" ");
        }
    }

    public static void main(String[] args){
        int arr[]={3, 6, 2, 1, 8, 7, 4, 5, 3, 1};
        // bubblesort(arr);
        // selectionsort(arr);
        // insertionSort(arr);

    }
}
