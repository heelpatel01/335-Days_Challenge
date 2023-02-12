import java.util.Scanner;

// Given an integer array nums, return true if any value appears at least twice in the array, and return 
// false if every element is distinct.

public class pqs_2_1 {

    public static boolean distinct(int arr[]){
        // isdistinct=true;
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]==arr[j]){
                    return true;
                }
            }
        }
        return false;
    }

    public static void main(String[] args){
        int n=10;
        int arr[]=new int[n];

        Scanner sc=new Scanner(System.in);

        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println(distinct(arr));
        sc.close();
    }
    
}
