public class bitop {
    // get the bit
    public static int getbit(int n , int i){
        int bitmask=1<<i;
        if((n & bitmask)==0){
            return 0;
        }
        else{
            return 1;
        }
    }
// set the bit
    public static int setbit(int n ,int i){
        int bitmask=1<<i;
        return (n | bitmask);
    }
    // clear the bit 
    public static int clearbit(int n ,int i){
        int bitmask= ~(1<<i);
        return (n & bitmask);
    }
    // update the bit
    public static int update(int n,int i, int newbit){
        // method 1
        // if(newbit==0){
        //     return clearbit(n, i);
        // }
        // else{
        //     return setbit(n, i);
        // }
    // method 2
    n=clearbit(n, i);
    int bitmask=newbit<<i;
    return n | bitmask;
    } 

    // clear last i bit
    public static int clearIbit(int n , int i){
        int bitmask=(-1)<<i;
        return n & bitmask;
    }
    
    // CLEAR RANGE 
    public static int clearange(int n, int i,int j){
        int a= -1<<(j+1);
        int b=(1<<i)-1;
        int bitmask=a|b;
        return n & bitmask;
    }
    // check number is power of 2
    public static boolean check(int n){
        if((n & (n-1) )==0){
            return true;
        }
        return false;
    } 
    // question count bits
    public static int count(int n){
        int count =0;
        while(n>0){
            if((n&1)!=0){
                count++;
            }
            n=n>>1;
        }
        return count;
    }
    // fast exponation
    public static int fastexpo(int a , int n){
        int ans=1;
        while(n>0){
            if((n&1)!=0){
                ans = ans*a;
            }
            a= a*a;
            n=n>>1;
        }
        return ans;
    }
    //adding 1 to integer

    public static int addint(int n ){
         ;
        return -(~n);
    }
        public static void main(String[] args) {
        // System.out.println(getbit(4, 2));
        System.out.println(addint(6));
        System.out.println(-(~1)-);
    }
}
