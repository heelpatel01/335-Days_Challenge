public class My71th_Counting_Sort {

        public static void sortArray(int arr[]) {
            int largest=Integer.MIN_VALUE;
            for(int i=0;i<arr.length;i++){
                largest=Math.max(largest,arr[i]);
            }  
            int count[]=new int[largest+1];
            for(int i=0;i<arr.length;i++){
                count[arr[i]]++;
            }
    
            int j=0;
            for(int i=0;i<count.length;i++){
                while(count[i]>0){
                    arr[j]=i;
                    j++;
                    count[i]--;
                }
            }
    
            for(int i=0;i<arr.length;i++){
                System.out.print(arr[i]+" ");
            }
        }
    
        public static void main(String[] args){
            int arr[]={5,4,3,4};
            sortArray(arr);
        }
    }
