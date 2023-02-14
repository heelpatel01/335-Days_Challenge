public class My63rd_Selection_Sort {

    public static void selectionSort(int arr[]){
        
        for(int i=0;i<arr.length-1;i++){
            int minposition=i;
            for(int j=minposition+1;j<arr.length;j++){
                if(arr[j]<arr[minposition]){
                    minposition=j;
                }
            }
            int temp=arr[minposition];
            arr[minposition]=arr[i];
            arr[i]=temp;

        }
        for(int i=0;i<arr.length;i++){

            System.out.println(arr[i]);
        }
    }

    public static void main(String[] args){
        int arr[]={5,4,1,3,2};
        selectionSort(arr);
    }
    
}
// public class My63rd_Selection_Sort {
//     public static void selectionSort(int arr[]) {
//         for (int i = 0; i < arr.length - 1; i++) {
//             int minPosition = i;
//             for (int j = i + 1; j < arr.length; j++) {
//                 if (arr[j] < arr[minPosition]) {
//                     minPosition = j;
//                 }
//             }
//             int temp = arr[minPosition];
//             arr[minPosition] = arr[i];
//             arr[i] = temp;
//         }
//         for (int i = 0; i < arr.length; i++) {
//             System.out.println(arr[i]);
//         }
//     }

//     public static void main(String[] args) {
//         int arr[] = {5, 4, 1, 3, 2};
//         selectionSort(arr);
//     }
// }
