
public class subarrsum {
    public static void sum(int numbers[]){
        int max=Integer.MIN_VALUE;
        int curr=0;
        int[] prefix=new int[numbers.length];
        prefix[0]=numbers[0];
        for(int i=1;i<prefix.length;i++){
            prefix[i]=prefix[i-1]+numbers[i];
        }
        for(int i=0;i<numbers.length;i++){
            for(int j=i;j<numbers.length;j++){
               
                curr=(i==0)? prefix[j]:prefix[j]-prefix[i-1];
                // for(int k=i;k<=j;k++){
                //     curr+=numbers[k];
                //     System.out.println(curr);
                    if(curr>max){
                        max=curr;
                    }
                   
                
                System.out.println();
            }
        }System.out.println(max);
    }
    public static void main(String[] args) {
        int numbers[]={1,2,4,5,6};
        sum(numbers);
    }
}
