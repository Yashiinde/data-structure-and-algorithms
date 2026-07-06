public class traprain {
    public static void trap(int nums[]){
        int n=nums.length;
        int maxleft[]=new int[nums.length]; 
        maxleft[0]=nums[0];
        for(int i=1;i<n;i++){
            maxleft[i]=Math.max(nums[i], maxleft[i-1]);
        }
        int maxright[]=new int[nums.length];
        maxright[n-1]=nums[n-1];
        for(int i=n-2;i>=0;i--){ 
            maxright[i]=Math.max(nums[i], maxright[i+1]);
        } 
        int tra=0;
        for(int i=0;i<n;i++){
            int waterlevel=Math.min(maxleft[i], maxright[i]);
             tra+= waterlevel-nums[i];
        }
        for(int i=0;i<maxright.length;i++){
        System.out.print(maxright[i]+" ");
        // return tra;
    }
    System.out.println();
     for(int i=0;i<maxleft.length;i++){
        System.out.print(maxleft[i]+" ");
     }
}
public static void main(String[] args) {
    int nums[]={4,2,0,6,1,2,5};
    trap(nums);
    // for(int i=0;i<maxright.length;i++){
    //     System.out.print(maxright[i]+" ");   
}
    
}