public class My61th_Best_Time_to_Buy_and_Sell_Stock2 {
    public static int stock(int prices[]){
        int buyprice=Integer.MAX_VALUE;
        // int profit=0;
        int maxprofit=0;
        for (int i=0;i<prices.length;i++){
            if(buyprice<prices[i]){
                int profit=prices[i]-buyprice;
                maxprofit=Math.max(maxprofit,profit);
            }else
            {
                buyprice=prices[i];
            }
        }
        return maxprofit;
    }

    public static void main (String[] args){
        int prices[]={7,1,5,3,6,4};
        System.out.println(stock(prices));
    }

}
