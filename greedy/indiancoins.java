import java.util.*;

public class indiancoins {
    public static void main(String[] args) {
        Integer[] coins={1,2,5,10,20,50,100,500,1000,2000};
        Arrays.sort(coins,Comparator.reverseOrder());
        int money=283;
        int count=0;
        ArrayList<Integer> ans= new ArrayList<>();
        for(int i=0;i<coins.length;i++){
            while(coins[i]<=money){
                count++;
                money-=coins[i];
                ans.add(coins[i]);

            }
        }
        System.out.println(ans);
        System.out.println(count);
    }
}
