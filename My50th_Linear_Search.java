import java.util.Scanner;

public class My50th_Linear_Search {

    public static int linearSearch(int arr[],int key){
        for(int i=0;i<arr.length;i++){
            if(arr[i]==key){
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args){
        int arr[]={2,4,6,8,10,12,14};
        // int key=10;
        
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter Key To Find Index:- ");
        int key=sc.nextInt();

        int index=linearSearch(arr, key);
        if(index == -1){
            System.out.println(key+" Not Found");
        }else{
            System.out.println("Key Is At "+index+"th Index");
        }


        sc.close();
    }
    
}
