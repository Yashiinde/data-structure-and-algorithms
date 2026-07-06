public class Solution {
    public static int maxProfit(int[] prices) {
        int profit=0;
        int maxprofi=0;
        int i=0;
        while(i<prices.length-1){
        // for(int i=0;i<prices.length;i++){
            // for(int j=i+1;j<prices.length;j++){
                if(prices[i]<prices[i+1]){
                    profit += prices[i+1]-prices[i];
                    maxprofi=Math.max(profit,maxprofi);
                }
            i++;
        }return maxprofi;
    }

    public static void main(String[] args) {
       int[] prices={7,1,5,3,6,4};
       System.out.println(maxProfit(prices));
       
        
    }
}