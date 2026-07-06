public class buysell {
    public static int buysellstock(int[] numbers){
        int buyprice=numbers[0];
        int maxprice=0;
        for(int i=1;i<numbers.length;i++){
            if(buyprice<numbers[i]){
                int profit=numbers[i]-buyprice;
                maxprice=Math.max(maxprice,profit);
            }
            else{
                buyprice=numbers[i];
            }
        }return maxprice;
    }
    public static void main(String[] args) {
        int[] numbers={2,3,7,5 };
        System.out.println(buysellstock(numbers));
    }
}
