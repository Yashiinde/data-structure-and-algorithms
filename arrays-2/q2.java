public class q2 {
    public static int pro(int[] prices){
        int buyprice=Integer.MAX_VALUE;
        int maxprice=0;
        for(int i=0;i<prices.length;i++){
            if(buyprice<prices[i]){
                int profit= prices[i]-buyprice;
                maxprice=Math.max(maxprice, profit);
                
             }else{
                buyprice=prices[i];
             }
            }
            if(maxprice>buyprice){
             return maxprice;
             
        }else{
            return 0;
        } 
    }
    public static void main(String[] args) {
        int[] prices={1,2};
        System.out.println(pro(prices));
    }
}
