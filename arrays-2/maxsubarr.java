public class maxsubarr {
    public static void kadans(int numbers[]){
        int maxsum=Integer.MIN_VALUE;
        int currsum=0;
        for(int i=0;i<numbers.length;i++){
            currsum=currsum+numbers[i];
            if(currsum<0){
                currsum=0;
            }
            maxsum=Math.max(maxsum, currsum);
        }
        System.out.println(maxsum);
        }

    public static void main(String[] args) {
        int numbers[]={-2,-3,4,-1,-2,2,5,-3};
        kadans(numbers);
    }
}