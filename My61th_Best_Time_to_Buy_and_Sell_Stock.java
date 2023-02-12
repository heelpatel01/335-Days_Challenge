// // prices = [7,1,5,3,6,4]
// //my way


// public class My61th_Best_Time_to_Buy_and_Sell_Stock{
//     public static int stock(int prices[]){
//         int n=prices.length;
//         int min=Integer.MAX_VALUE;
//         int max=Integer.MIN_VALUE;
//         int bp=0;

//         for(int i=0;i<n;i++){
//             if(min<prices[i]){
//                 min=prices[i];
//                 bp=i;
//             }
//         }

//         for(int j=bp;j<n;j++){
//             if(prices[j]>max-min){
//                 max=prices[j];
//             }
            
//         }
//         return max;
//     }

//     public static void main(String[] args){
//         int prices[]={7,1,5,3,6,4};
//         System.out.println(stock(prices));
//     }
// }

public class My61th_Best_Time_to_Buy_and_Sell_Stock{
    public static int stock(int prices[]) {
        int n = prices.length;
        int min = Integer.MAX_VALUE;
        int maxDiff = Integer.MIN_VALUE;
        int bp = 0;

        for (int i = 0; i < n; i++) {
            if (prices[i] < min) {
                min = prices[i];
                bp = i;
            }
        }

        for (int j = bp; j < n; j++) {
            if (prices[j] - min > maxDiff) {
                maxDiff = prices[j] - min;
            }
        }

        return maxDiff;
    }
    public static void main(String[] args){
        int prices[]={7,1,3,6,5,4};
        int maxprofit=stock(prices);
        System.out.println(maxprofit);
    }
}
