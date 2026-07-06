public class q4 {
    public static int drop(int[] nums){
        int n=nums.length;
        int[] maxleft=new int[n];
        maxleft[0]=nums[0];
        for(int i=1;i<n;i++){
            maxleft[i]=Math.max(nums[i], maxleft[i-1]);
        }
        int[] maxright=new int[n];
        maxright[n-1]=nums[n-1];
        for(int i=n-2;i>=0;i--){
            maxright[i]=Math.max(nums[i], maxright[i+1]);
        }
        int par=0;
        for(int i=0;i<n;i++){
            int waterlevel=Math.min(maxleft[i], maxright[i]);
            par+=waterlevel-nums[i];
        }return par;
    }
    public static void main(String[] args) {
        int[] nums={4, 2, 0, 3, 2, 5};
        System.out.println(drop(nums));
    }
}
